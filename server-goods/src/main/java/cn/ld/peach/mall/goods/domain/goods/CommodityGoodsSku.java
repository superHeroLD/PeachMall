package cn.ld.peach.mall.goods.domain.goods;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 商品SKU信息
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CommodityGoodsSku extends BaseDO {

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * sku编号
     */
    private String goodsSkuCode;

    /**
     * 采购价格
     */
    private BigDecimal purchasePrice;

    /**
     * 销售价格
     */
    private BigDecimal salePrice;

    /**
     * 促销价格
     */
    private BigDecimal discountPrice;
}
