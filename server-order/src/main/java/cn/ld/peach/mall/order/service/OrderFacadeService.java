package cn.ld.peach.mall.order.service;

/**
 * 订单接口
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface OrderFacadeService {

    /**
     * 商品完成发货
     *
     * @param orderId 订单编号
     * @return 处理结果
     */
    Boolean goodsDelivery(Long orderId);


}
