package cn.ld.peach.mall.auth.mapper;

import cn.ld.peach.mall.auth.BaseTest;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * AuthPriorityMapper 单元测试
 *
 * @author lidong
 * @date 2021/3/25
 */
@Slf4j
@RunWith(SpringRunner.class)
public class AuthPriorityMapperTest extends BaseTest {

    @Resource
    private AuthPriorityMapper authPriorityMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<AuthPriority> priorityList = authPriorityMapper.selectList(null);
        System.out.println("priorityList: " + priorityList);
    }
}
