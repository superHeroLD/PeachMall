package cn.ld.peach.mall.order.service.impl;

import cn.ld.peach.mall.order.domain.dto.OrderDTO;
import cn.ld.peach.mall.order.service.OrderService;

/**
 * @author lidong
 * @date 2021/4/8
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public Boolean goodsDelivery(Long orderId) {
        return false;
    }

    @Override
    public void createOrder(OrderDTO orderDTO) {
    }
}
