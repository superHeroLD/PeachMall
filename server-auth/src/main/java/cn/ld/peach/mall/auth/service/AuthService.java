package cn.ld.peach.mall.auth.service;

import cn.ld.peach.mall.auth.domain.dto.AuthPriorityDTO;

import java.util.List;

/**
 * @author lidong
 * @date 2021/3/25
 */
public interface AuthService {

    /**
     * 查询所有根权限
     *
     * @return 所有根权限
     */
    List<AuthPriorityDTO> listRootAuthPriority();

}
