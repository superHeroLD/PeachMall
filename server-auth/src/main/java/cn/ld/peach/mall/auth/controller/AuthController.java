package cn.ld.peach.mall.auth.controller;

import cn.ld.peach.mall.auth.domain.dto.AuthPriorityDTO;
import cn.ld.peach.mall.auth.domain.vo.AuthPriorityVO;
import cn.ld.peach.mall.auth.service.AuthService;
import cn.ld.peach.mall.commons.lang.base.ResultT;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Auth Controller
 *
 * @author lidong
 * @date 2021/3/25
 */
@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private AuthService authService;

    @GetMapping("/listRootAuthPriority")
    ResultT<List<AuthPriorityVO>> listRootAuthPriority() {
        return ResultT.successG(BeanCopierUtil.copyList(authService.listRootAuthPriority(), AuthPriorityVO.class));
    }

    @GetMapping("/child/{parentId}")
    ResultT<List<AuthPriorityVO>> getChildPriorities(@PathVariable("parentId") Long parentId) {
        return ResultT.successG(BeanCopierUtil.copyList(authService.listChildPriorities(parentId), AuthPriorityVO.class));
    }

    @GetMapping("/getPriority/{id}")
    ResultT<AuthPriorityVO> getAuthPriorityById(@PathVariable("id") Long id) {
        return ResultT.successG(BeanCopierUtil.copy(authService.getAuthPriorityById(id), AuthPriorityVO.class));
    }

    @PostMapping("addAuthPriority")
    @SuppressWarnings("unchecked")
    ResultT<Void> addAuthPriority(@RequestBody AuthPriorityVO request) {
        authService.addAuthPriority(BeanCopierUtil.copy(request, AuthPriorityDTO.class));
        return ResultT.success();
    }

    @PostMapping("updateAuthPriority")
    @SuppressWarnings("unchecked")
    ResultT<Void> updateAuthPriority(@RequestBody AuthPriorityVO request) {
        authService.updateAuthPriority(BeanCopierUtil.copy(request, AuthPriorityDTO.class));
        return ResultT.success();
    }

    @GetMapping("/delAuthPriority/{id}")
    ResultT<Boolean> delAuthPriorityById(@PathVariable("id") Long id) {
        return ResultT.successG(authService.removeAuthPriority(id));
    }
}
