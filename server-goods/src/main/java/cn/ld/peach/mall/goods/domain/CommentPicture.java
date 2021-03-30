package cn.ld.peach.mall.goods.domain;


import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 评论图片信息
 *
 * @author lidong
 * @date 2021/3/25
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CommentPicture extends BaseDO {

    /**
     * 评论ID
     */
    private Long commentInfoId;
    /**
     * 图片顺序
     */
    private Integer sequence;
    /**
     * 图片信息
     * 这里的图片正常来说应该存储的是S3的地址
     * 图片一般不直接存在数据库里
     */
    private String commentPicture;
}
