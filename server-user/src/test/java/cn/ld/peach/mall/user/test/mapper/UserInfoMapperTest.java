package cn.ld.peach.mall.user.test.mapper;

import cn.ld.peach.mall.user.domain.UserInfo;
import cn.ld.peach.mall.user.mapper.UserInfoMapper;
import cn.ld.peach.mall.user.test.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * userInfo mapper test
 *
 * @author lidong
 * @date 2021/4/10
 */
@Slf4j
public class UserInfoMapperTest extends BaseTest {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    public void insertTest() {
        UserInfo testUserInfo = new UserInfo();
        testUserInfo.userName("TestUser" + ThreadLocalRandom.current().nextInt(100))
                .birthday(new Date())
                .registerTime(new Date())
                .password("testPassword" + ThreadLocalRandom.current().nextInt(1000))
                .cellPhoneNumber(String.valueOf(ThreadLocalRandom.current().nextLong(10000000000L, 20000000000L)))
                .gender(1)
                .email("testEmail@peach.cn")
                .realName("大聪明");
        testUserInfo.setCreateTime(new Date());
        testUserInfo.setUpdateTime(new Date());

        int insertNum = userInfoMapper.insert(testUserInfo);
        Assert.assertEquals(insertNum, 1);
    }
}
