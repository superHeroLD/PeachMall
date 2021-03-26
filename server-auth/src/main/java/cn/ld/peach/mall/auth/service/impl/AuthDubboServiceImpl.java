package cn.ld.peach.mall.auth.service.impl;

import cn.ld.peach.mall.auth.service.AuthDubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * dubbo 测试 service
 *
 * @author lidong
 * @date 2021/3/26
 */
@Slf4j
@DubboService
public class AuthDubboServiceImpl implements AuthDubboService {

    @Override
    public String hello() {
        return "Hello, this is auth server";
    }
}
