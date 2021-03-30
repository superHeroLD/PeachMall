package cn.ld.peach.mall.goods.domain.dto;

import cn.ld.peach.mall.commons.lang.base.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lidong
 * @date 2021/3/30
 */
@Data
@AllArgsConstructor
public class CommentPictureDTO extends BaseDTO {

    private long commentInfoId;

    private long sequence;

    private String commentPicture;
}
