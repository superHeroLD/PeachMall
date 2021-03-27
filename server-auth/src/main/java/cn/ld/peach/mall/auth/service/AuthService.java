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


    /**
     * 根据父权限查询子权限
     *
     * @param parentId 权限ID
     * @return 子权限
     */
    List<AuthPriorityDTO> listChildPriorities(Long parentId);

    /**
     * 添加权限
     *
     * @param request 请求
     */
    void addAuthPriority(AuthPriorityDTO request);

    /**
     * 更新权限
     *
     * @param request 请求
     */
    void updateAuthPriority(AuthPriorityDTO request);

    /**
     * 根据ID查询权限
     *
     * @param parentId 权限ID
     * @return 权限信息
     */
    AuthPriorityDTO getAuthPriorityById(Long parentId);
}
