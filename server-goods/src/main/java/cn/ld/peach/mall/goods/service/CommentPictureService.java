package cn.ld.peach.mall.goods.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 评论图Interface
 *
 * @author lidong
 * @date 2021/3/30
 */
public interface CommentPictureService {

    /**
     * 保存评论图片
     *
     * @param commentInfoId 评论ID
     * @param files         上传文件
     */
    void saveCommentPicture(Long commentInfoId, MultipartFile[] files);
}
