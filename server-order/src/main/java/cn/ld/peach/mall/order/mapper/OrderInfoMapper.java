package cn.ld.peach.mall.order.mapper;

import cn.ld.peach.mall.order.domain.OrderInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单信息Mapper
 *
 * @author lidong
 * @date 2021/4/1
 */
@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
}
