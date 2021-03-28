package cn.ld.peach.mall.auth.service;

import cn.ld.peach.mall.auth.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 权限服务单元测试
 *
 * @author lidong
 * @date 2021/3/28
 */
@Slf4j
@Transactional
public class AuthServiceTest extends BaseTest {

    @Resource
    private AuthService authService;

    @Test
    public void removeAuthPriorityTest() {
        Boolean result = authService.removeAuthPriority(1L);
        Assert.assertEquals(result, true);
    }
}
