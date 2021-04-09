package cn.ld.peach.mall.goods.service.impl;

import cn.ld.peach.mall.goods.domain.comment.CommentPicture;
import cn.ld.peach.mall.goods.mapper.comment.CommentPictureMapper;
import cn.ld.peach.mall.goods.service.CommentPictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 评论图片服务层实现
 *
 * @author lidong
 * @date 2021/3/30
 */
@Slf4j
@Service
public class CommentPictureServiceImpl implements CommentPictureService {

    @Resource
    private CommentPictureMapper commentPictureMapper;

    /**
     * 模拟文件上传路径
     */
    private static final String UPLOAD_DIR = "http://example/aaa/xxx/xxx/picture.xxx";

    @Override
    public void saveCommentPicture(Long commentInfoId, MultipartFile[] files) {
        //模拟一下不存图片了
        CommentPicture commentPicture = new CommentPicture();
        commentPicture.setCommentInfoId(commentInfoId);
        commentPicture.setId(null);
        commentPicture.setCreateTime(new Date());
        commentPicture.setUpdateTime(new Date());
        commentPicture.setSequence(1);
        commentPicture.setCommentPicture(UPLOAD_DIR);

        commentPictureMapper.insert(commentPicture);
    }
}
