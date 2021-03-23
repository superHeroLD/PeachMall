package cn.ld.peach.mall.goods.dto;

import cn.ld.peach.mall.commons.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 商品SKU DTO
 *
 * @author lidong
 * @date 2021/3/23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsSkuDTO extends BaseDTO {

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 商品SKU编号
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
     * 折扣价格
     */
    private BigDecimal discountPrice;
}
