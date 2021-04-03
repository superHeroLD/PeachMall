package cn.ld.peach.mall.order.mapper;

import cn.ld.peach.mall.order.BaseTest;
import cn.ld.peach.mall.order.domain.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lidong
 * @date 2021/4/3
 */
@Slf4j
public class OrderInfoMapperTest extends BaseTest {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Test
    public void testSelectList() {
        List<OrderInfo> orderInfoList = orderInfoMapper.selectList(null);
        log.info("orderInfoList: {}", orderInfoList);
    }
}
