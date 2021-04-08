package cn.ld.peach.mall.order.domain.dto;

import cn.ld.peach.mall.commons.lang.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单商品详情
 *
 * @author lidong
 * @date 2021/4/8
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderItemDTO extends BaseDTO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品SKU ID
     */
    private Long goodsSkuId;

    /**
     * 商品SKU编码
     */
    private String goodsSkuCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 销售属性，机身颜色:白色,内存容量:256G
     */
    private String saleProperties;

    /**
     * 商品毛重
     */
    private Double goodsGrossWeight;

    /**
     * 购买数量
     */
    private Long purchaseQuantity;

    /**
     * 商品购买价格
     */
    private Double purchasePrice;

    /**
     * 促销活动ID
     */
    private Long promotionActivityId;

    /**
     * 商品长度
     */
    private Double goodsLength;

    /**
     * 商品宽度
     */
    private Double goodsWidth;

    /**
     * 商品高度
     */
    private Double goodsHeight;
}
