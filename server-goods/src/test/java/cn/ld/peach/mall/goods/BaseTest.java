package cn.ld.peach.mall.goods;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基础测试类
 *
 * @author lidong
 * @date 2021/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerGoodsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTest {
}
