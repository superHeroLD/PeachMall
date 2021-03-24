package cn.ld.peach.mall.finance.service;

import cn.ld.peach.mall.wms.dto.PurchaseInputOrderDTO;

/**
 * 财务中心服务层
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface FinanceFacadeService {

    /**
     * 创建采购结算单
     *
     * @param purchaseInputOrderDTO 采购结算单
     * @return 处理结果
     */
    Boolean createPurchaseSettlementOrder(PurchaseInputOrderDTO purchaseInputOrderDTO);
}
