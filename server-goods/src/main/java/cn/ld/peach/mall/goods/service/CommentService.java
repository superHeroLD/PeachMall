package cn.ld.peach.mall.goods.service;

import cn.ld.peach.mall.goods.domain.dto.CommentInfoDTO;

/**
 * 评论Interface
 *
 * @author lidong
 * @date 2021/3/30
 */
public interface CommentService {

    /**
     * 保存评论信息
     *
     * @param commentInfoDTO 评论信息ø
     */
    void saveCommentInfo(CommentInfoDTO commentInfoDTO);
}
