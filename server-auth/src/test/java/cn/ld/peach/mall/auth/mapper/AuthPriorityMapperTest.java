package cn.ld.peach.mall.auth.mapper;

import cn.ld.peach.mall.auth.BaseTest;
import cn.ld.peach.mall.auth.domain.AuthPriority;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * AuthPriorityMapper 单元测试
 *
 * @author lidong
 * @date 2021/3/25
 */
@Slf4j
public class AuthPriorityMapperTest extends BaseTest {

    @Resource
    private AuthPriorityMapper authPriorityMapper;

    @Test
    public void testSelect() {
        List<AuthPriority> priorityList = authPriorityMapper.selectList(null);
        log.info("priorityList: {}", priorityList);
    }
}
