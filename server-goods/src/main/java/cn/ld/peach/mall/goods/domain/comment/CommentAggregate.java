package cn.ld.peach.mall.goods.domain.comment;


import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 评论概要信息ø
 *
 * @author lidong
 * @date 2021/3/25
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CommentAggregate extends BaseDO {

    /**
     * 商品ID
     */
    private long goodsId;
    /**
     * 评论总数量
     */
    private long totalCommentCount;
    /**
     * 好评数量
     */
    private long goodCommentCount;
    /**
     * 好评率
     */
    private double goodCommentRate;
    /**
     * 晒图评论数量
     */
    private long showPicturesCommentCount;

    /**
     * 中评数量
     */
    private long mediumCommentCount;

    /**
     * 差评数量
     */
    private long badCommentCount;
}
