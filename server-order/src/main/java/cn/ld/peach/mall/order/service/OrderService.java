package cn.ld.peach.mall.order.service;

import cn.ld.peach.mall.order.domain.dto.OrderDTO;

/**
 * 订单接口
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface OrderService {

    /**
     * 商品完成发货
     *
     * @param orderId 订单编号
     * @return 处理结果
     */
    Boolean goodsDelivery(Long orderId);

    /**
     * 创建订单
     *
     * @param orderDTO 订单信息
     * @return
     */
    void createOrder(OrderDTO orderDTO);
}
