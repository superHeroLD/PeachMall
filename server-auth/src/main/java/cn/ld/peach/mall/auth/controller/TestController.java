package cn.ld.peach.mall.auth.controller;

import cn.ld.peach.mall.auth.config.NacosConfig;
import cn.ld.peach.mall.commons.lang.base.ResultT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lidong
 * @date 2021/3/27
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private NacosConfig nacosConfig;

    @GetMapping("/testNacosConfig")
    ResultT<String> testNacosConfig() {
        String appName = nacosConfig.getAppName();
        log.info("get appName from nacos config: {}", appName);
        return ResultT.successG(appName);
    }
}
