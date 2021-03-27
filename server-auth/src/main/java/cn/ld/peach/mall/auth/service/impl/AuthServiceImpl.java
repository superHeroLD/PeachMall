package cn.ld.peach.mall.auth.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import cn.ld.peach.mall.auth.domain.dto.AuthPriorityDTO;
import cn.ld.peach.mall.auth.mapper.AuthPriorityMapper;
import cn.ld.peach.mall.auth.service.AuthService;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

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

    @Override
    public List<AuthPriorityDTO> listRootAuthPriority() {
        List<AuthPriority> authPriorities = authPriorityMapper.selectList(new QueryWrapper<AuthPriority>().isNotNull("parent_id"));
        if (CollectionUtil.isEmpty(authPriorities)) {
            return Collections.emptyList();
        }

        return BeanCopierUtil.copyList(authPriorities, AuthPriorityDTO.class);
    }
}
