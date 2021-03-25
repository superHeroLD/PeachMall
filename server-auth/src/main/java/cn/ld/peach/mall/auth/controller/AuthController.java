package cn.ld.peach.mall.auth.controller;

import cn.ld.peach.mall.auth.domain.vo.AuthPriorityVO;
import cn.ld.peach.mall.auth.service.AuthService;
import cn.ld.peach.mall.commons.util.BeanCopierUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    List<AuthPriorityVO> listRootAuthPriority() {
        return BeanCopierUtil.copyList(authService.listRootAuthPriority(), AuthPriorityVO.class);
    }
}
