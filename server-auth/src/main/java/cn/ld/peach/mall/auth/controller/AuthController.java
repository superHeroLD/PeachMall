package cn.ld.peach.mall.auth.controller;

import cn.ld.peach.mall.auth.config.NacosConfig;
import cn.ld.peach.mall.auth.domain.vo.AuthPriorityVO;
import cn.ld.peach.mall.auth.service.AuthService;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private AuthService authService;
    @Resource
    private NacosConfig nacosConfig;

    @Value("${message:nulla}")
    private String message;

    @GetMapping("/listRootAuthPriority")
    List<AuthPriorityVO> listRootAuthPriority() {
        return BeanCopierUtil.copyList(authService.listRootAuthPriority(), AuthPriorityVO.class);
    }

    @GetMapping("/testNacosConfig")
    String testNacosConfig() {
        String appName = nacosConfig.getAppName();
        log.info("appName: {}", appName);
        return appName;
    }
}
