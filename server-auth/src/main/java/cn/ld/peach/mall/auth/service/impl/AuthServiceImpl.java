package cn.ld.peach.mall.auth.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.ld.peach.mall.auth.design.visiter.PriorityNodeRelateCheckVisitor;
import cn.ld.peach.mall.auth.design.visiter.PriorityNodeRelateDeleteVisitor;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import cn.ld.peach.mall.auth.domain.PriorityNode;
import cn.ld.peach.mall.auth.domain.dto.AuthPriorityDTO;
import cn.ld.peach.mall.auth.mapper.AccountPriorityRelationshipMapper;
import cn.ld.peach.mall.auth.mapper.AuthPriorityMapper;
import cn.ld.peach.mall.auth.mapper.RolePriorityRelationshipMapper;
import cn.ld.peach.mall.auth.service.AuthService;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * 权限service实现层
 *
 * @author lidong
 * @date 2021/3/25
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    private AuthPriorityMapper authPriorityMapper;
    @Resource
    private RolePriorityRelationshipMapper rolePriorityRelationshipMapper;
    @Resource
    private AccountPriorityRelationshipMapper accountPriorityRelationshipMapper;

    @Override
    public List<AuthPriorityDTO> listRootAuthPriority() {
        List<AuthPriority> authPriorities = authPriorityMapper.selectList(new QueryWrapper<AuthPriority>().isNotNull("parent_id"));
        if (CollectionUtil.isEmpty(authPriorities)) {
            return Collections.emptyList();
        }
        return BeanCopierUtil.copyList(authPriorities, AuthPriorityDTO.class);
    }

    @Override
    public List<AuthPriorityDTO> listChildPriorities(Long parentId) {
        checkArgument(Objects.nonNull(parentId) && parentId > 0, "parentId is error");
        return BeanCopierUtil.copyList(authPriorityMapper.selectList(Wrappers.<AuthPriority>lambdaQuery().eq(AuthPriority::getParentId, parentId)), AuthPriorityDTO.class);
    }

    @Override
    public void addAuthPriority(AuthPriorityDTO request) {
        checkArgument(Objects.nonNull(request), "request is null");
        int insertNum = authPriorityMapper.insert(BeanCopierUtil.copy(request, AuthPriority.class));
        log.info("[addAuthPriority] insert: {} authPriority into db", insertNum);
    }

    @Override
    public void updateAuthPriority(AuthPriorityDTO request) {
        checkArgument(Objects.nonNull(request), "request is null");
        checkArgument(Objects.nonNull(request.getId()), "id is null");

        int updateNum = authPriorityMapper.updateById(BeanCopierUtil.copy(request, AuthPriority.class));
        log.info("[addAuthPriority] update: {} authPriority", updateNum);
    }

    @Override
    public AuthPriorityDTO getAuthPriorityById(Long id) {
        checkArgument(Objects.nonNull(id) && id > 0, "id is error");
        return BeanCopierUtil.copy(authPriorityMapper.selectById(id), AuthPriorityDTO.class);
    }

    /**
     * 访问者模式删除权限
     * 注意：实际开发中不会这么写，效率太低了，这里只是为了实验设计模式
     */
    @Override
    public Boolean removeAuthPriority(Long id) {
        AuthPriority authPriority = authPriorityMapper.selectById(id);
        if (Objects.isNull(authPriority)) {
            return false;
        }

        PriorityNode priorityNode = BeanCopierUtil.copy(authPriority, PriorityNode.class);
        if (Objects.isNull(priorityNode)) {
            return false;
        }

        PriorityNodeRelateCheckVisitor checkVisitor = new PriorityNodeRelateCheckVisitor(authPriorityMapper,
                rolePriorityRelationshipMapper,
                accountPriorityRelationshipMapper);

        checkVisitor.visit(priorityNode);
        if (checkVisitor.getCheckResult()) {
            return false;
        }

        PriorityNodeRelateDeleteVisitor deleteVisitor = new PriorityNodeRelateDeleteVisitor(authPriorityMapper);
        deleteVisitor.visit(priorityNode);
        return true;
    }
}
