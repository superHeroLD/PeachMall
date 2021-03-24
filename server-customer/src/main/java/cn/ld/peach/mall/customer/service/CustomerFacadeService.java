package cn.ld.peach.mall.customer.service;

/**
 * 客服中心接口
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface CustomerFacadeService {

    /**
     * 创建退货工单
     *
     * @param orderId            订单ID
     * @param orderNo            订单编号
     * @param returnGoodsReason  退货原因
     * @param returnGoodsComment 退货备注
     * @return 处理结果
     */
    Boolean createReturnGoodsWorksheet(Long orderId, String orderNo, String returnGoodsReason, String returnGoodsComment);
}
