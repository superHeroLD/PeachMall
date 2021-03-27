package cn.ld.peach.mall.wms.dto;

import cn.ld.peach.mall.commons.lang.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 销售出库单
 *
 * @author lidong
 * @date 2021/3/24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SaleDeliveryOrderDTO extends BaseDTO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户账号ID
     */
    private Long userAccountId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 收货地址
     */
    private String deliveryAddress;

    /**
     * 收货人手机号码
     */
    private String consigneeCellPhoneNumber;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 应付金额
     */
    private BigDecimal payableAmount;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 纳税人识别号
     */
    private String taxpayerId;

    /**
     * 订单备注
     */
    private String orderComment;

    /**
     * 销售出库单状态
     */
    private Integer saleDeliveryOrderStatus;

    /**
     * 实际发货时间
     */
    private Date deliveryTime;
}
