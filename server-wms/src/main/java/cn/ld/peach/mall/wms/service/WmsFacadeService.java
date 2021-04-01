package cn.ld.peach.mall.wms.service;

import cn.ld.peach.mall.order.domain.dto.OrderDTO;

/**
 * wms service
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface WmsFacadeService {

    /**
     * 通知WMS中心-提交"订单"事件发生了
     * TODO 以后改成RocketMQ
     *
     * @param orderDTO 订单Dto
     * @return 创建结果
     */
    Boolean informSubmitOrder(OrderDTO orderDTO);
}
