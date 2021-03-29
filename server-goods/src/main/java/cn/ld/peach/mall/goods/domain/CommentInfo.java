package cn.ld.peach.mall.goods.domain;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 评论信息
 *
 * @author lidong
 * @date 2021/3/25
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CommentInfo extends BaseDO {
    /**
     * 用户账户ID
     */
    private long userAccountId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 订单ID
     */
    private long orderId;

    /**
     * 商品ID
     */
    private long goodsId;
    /**
     * 商品SKU id
     */
    private long goodsSkuId;

    /**
     * 商品销售属性
     */
    private String goodsSkuSaleProperties;

    /**
     * 总分
     */
    private long totalScore;

    /**
     * 商品评分
     */
    private long goodsScore;

    /**
     * 客服评分
     */
    private long customerServiceScore;

    /**
     * 物流评分
     */
    private long logisticsScore;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 是否晒图
     */
    private long isShowPictures;

    /**
     * 是否默认评论
     */
    private long isDefaultComment;

    /**
     * 评论状态
     * 1：待审核，2：已审核，3：审核不通过，4：已删除
     */
    private long commentStatus;

    /**
     * 评论类型
     * 1：好评，总分是4分以上；2：中评，3分；3：差评，1~2分
     */
    private long commentType;
}
