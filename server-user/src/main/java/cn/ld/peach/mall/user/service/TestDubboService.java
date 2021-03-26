package cn.ld.peach.mall.user.service;

import cn.ld.peach.mall.auth.service.AuthDubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author lidong
 * @date 2021/3/26
 */
@Slf4j
@Service
public class TestDubboService {

    @DubboReference
    private AuthDubboService authDubboService;

    public String testDubbo() {
        return authDubboService.hello();
    }
}
