package cn.ld.peach.mall.order.domain;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 订单信息
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class OrderInfo extends BaseDO {

    /**
     * 用户userAccountId
     */
    private long userAccountId;

    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 订单状态
     */
    private Long orderStatus;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 邮寄地址
     */
    private String deliveryAddress;

    /**
     * 收货人手机号
     */
    private String consigneeCellPhoneNumber;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 支付方式，1：支付宝，2：微信
     */
    private Long payType;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 促销活动折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 应付金额，订单总金额 - 促销活动折扣金额 - 优惠券抵扣金额 + 运费
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
     * 评论ID
     */
    private Long commentId;
}
