package cn.ld.peach.mall.auth.design.visiter;

import cn.hutool.core.collection.CollectionUtil;
import cn.ld.peach.mall.auth.domain.AuthAccountPriorityRelationship;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import cn.ld.peach.mall.auth.domain.PriorityNode;
import cn.ld.peach.mall.auth.domain.AuthRolePriorityRelationship;
import cn.ld.peach.mall.auth.mapper.AccountPriorityRelationshipMapper;
import cn.ld.peach.mall.auth.mapper.AuthPriorityMapper;
import cn.ld.peach.mall.auth.mapper.RolePriorityRelationshipMapper;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 权限树节点的关联检查访问者
 * <p>
 * 这个只是为了用实际模式，实际开发中不会这么写
 *
 * @author lidong
 * @date 2021/3/27
 */
@Slf4j
public class PriorityNodeRelateCheckVisitor implements PriorityNodeVisitor {

    /**
     * 关联检查的结果
     */
    @Getter
    private Boolean checkResult = false;

    /**
     * 权限Dao
     */
    private final AuthPriorityMapper authPriorityMapper;

    /**
     * 关联关系DAO
     */
    private final RolePriorityRelationshipMapper rolePriorityRelationshipMapper;

    /**
     * 账号与权限关联关系DAO
     */
    private final AccountPriorityRelationshipMapper accountPriorityRelationshipMapper;

    public PriorityNodeRelateCheckVisitor(AuthPriorityMapper authPriorityMapper,
                                          RolePriorityRelationshipMapper rolePriorityRelationshipMapper,
                                          AccountPriorityRelationshipMapper accountPriorityRelationshipMapper) {
        this.authPriorityMapper = authPriorityMapper;
        this.rolePriorityRelationshipMapper = rolePriorityRelationshipMapper;
        this.accountPriorityRelationshipMapper = accountPriorityRelationshipMapper;
    }

    @Override
    public void visit(PriorityNode priorityNode) {
        List<AuthPriority> authPriorities = authPriorityMapper.selectList(Wrappers.<AuthPriority>lambdaQuery().eq(AuthPriority::getParentId, priorityNode.getId()));
        if (CollectionUtil.isEmpty(authPriorities)) {
            return;
        }

        List<PriorityNode> priorityNodes = BeanCopierUtil.copyList(authPriorities, PriorityNode.class);
        //递归
        for (PriorityNode node : priorityNodes) {
            node.accept(this);
        }

        if (relateCheck(priorityNode)) {
            this.checkResult = true;
        }
    }

    /**
     * 检查权限是否被任何一个角色关联了或者用户关联了
     *
     * @param priorityNode 权限节点
     * @return 如果被占有了就返回true 否则返回false
     */
    private Boolean relateCheck(PriorityNode priorityNode) {
        Integer roleCountNum = rolePriorityRelationshipMapper.selectCount(Wrappers.<AuthRolePriorityRelationship>lambdaQuery()
                .eq(AuthRolePriorityRelationship::getPriorityId, priorityNode.getId()));

        Integer accountCountNum = accountPriorityRelationshipMapper.selectCount(Wrappers.<AuthAccountPriorityRelationship>lambdaQuery()
                .eq(AuthAccountPriorityRelationship::getPriorityId, priorityNode.getId()));

        log.info("[relateCheck] priorityNodeId: {} has {} role related and {} account related with it", priorityNode.getId(), roleCountNum, accountCountNum);

        return roleCountNum > 0 || accountCountNum > 0;
    }
}
