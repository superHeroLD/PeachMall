package cn.ld.peach.mall.auth.design.visiter;

import cn.hutool.core.collection.CollectionUtil;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import cn.ld.peach.mall.auth.domain.PriorityNode;
import cn.ld.peach.mall.auth.mapper.AuthPriorityMapper;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import java.util.List;
import java.util.Objects;

/**
 * 删除权限访问者
 * 递归删除
 *
 * @author lidong
 * @date 2021/3/27
 */
public class PriorityNodeRelateDeleteVisitor implements PriorityNodeVisitor {

    /**
     * 权限Dao
     */
    private final AuthPriorityMapper authPriorityMapper;

    public PriorityNodeRelateDeleteVisitor(AuthPriorityMapper authPriorityMapper) {
        this.authPriorityMapper = authPriorityMapper;
    }

    @Override
    public void visit(PriorityNode priorityNode) {
        List<AuthPriority> authPriorities = authPriorityMapper.selectList(Wrappers.<AuthPriority>lambdaQuery().eq(AuthPriority::getParentId, priorityNode.getParentId()));
        if (CollectionUtil.isEmpty(authPriorities)) {
            return;
        }

        List<PriorityNode> priorityNodes = BeanCopierUtil.copyList(authPriorities, PriorityNode.class);
        //递归
        for (PriorityNode node : priorityNodes) {
            node.accept(this);
        }

        removePriority(priorityNode.getId());
    }

    private void removePriority(Long id) {
        if (Objects.isNull(id)) {
            return;
        }

        authPriorityMapper.deleteById(id);
    }
}
