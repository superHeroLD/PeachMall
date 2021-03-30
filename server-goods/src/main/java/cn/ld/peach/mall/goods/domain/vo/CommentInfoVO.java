package cn.ld.peach.mall.goods.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * 评论信息vo
 *
 * @author lidong
 * @date 2021/3/30
 */
@Data
public class CommentInfoVO {

    /**
     * 用户账户ID
     */
    private Long userAccountId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 商品SKU id
     */
    private Long goodsSkuId;

    /**
     * 商品销售属性
     */
    private String goodsSkuSaleProperties;

    /**
     * 总分
     */
    private Integer totalScore;

    /**
     * 商品评分
     */
    private Integer goodsScore;

    /**
     * 客服评分
     */
    private Integer customerServiceScore;

    /**
     * 物流评分
     */
    private Integer logisticsScore;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 是否晒图
     */
    private Integer isShowPictures;

    /**
     * 是否默认评论
     */
    private Integer isDefaultComment;

    /**
     * 评论状态
     * 1：待审核，2：已审核，3：审核不通过，4：已删除
     */
    private Integer commentStatus;

    /**
     * 评论类型
     * 1：好评，总分是4分以上；2：中评，3分；3：差评，1~2分
     */
    private Integer commentType;

    /**
     * 创建时间
     */
    private Date createTime;
}
