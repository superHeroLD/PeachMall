package cn.ld.peach.mall.user.controller;

import cn.ld.peach.mall.user.service.TestDubboService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lidong
 * @date 2021/3/26
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class TestDubboController {

    @Resource
    private TestDubboService testDubboService;

    @GetMapping("/testDubbo")
    public String testDubbo() {
        return testDubboService.testDubbo();
    }
}
