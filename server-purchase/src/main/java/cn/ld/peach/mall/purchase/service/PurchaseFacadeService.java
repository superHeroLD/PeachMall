package cn.ld.peach.mall.purchase.service;

/**
 * 采购中心接口层
 *
 * @author lidong
 * @date 2021/3/23
 */
public interface PurchaseFacadeService {

    /**
     * 判断是否有相关商品sku的采购单
     *
     * @param goodsSkuId 商品SKU id
     * @return 是否有采购单关联了商品SKU
     */
    Boolean exitRelatedPurchaseOrder(Long goodsSkuId);

    /**
     * 创建了采购入库单
     *
     * @param purchaseOrderId 采购单ID
     * @return 处理结果
     */
    Boolean createPurchaseInputOrder(Long purchaseOrderId);

    /**
     * 完成采购入库单
     *
     * @param purchaseOrderId 采购单ID
     * @return 处理结果
     */
    Boolean finishPurchaseInputOrder(Long purchaseOrderId);

    /**
     * 创建采购入库单结算
     *
     * @param purchaseOrderId 采购单ID
     * @return 处理结果
     */
    Boolean createPurchaseSettlement(Long purchaseOrderId);

    /**
     * 完成采购入库单结算
     *
     * @param purchaseOrderId 采购单ID
     * @return 处理结果
     */
    Boolean finishPurchaseSettlement(Long purchaseOrderId);
}
