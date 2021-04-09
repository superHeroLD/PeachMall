package cn.ld.peach.mall.goods.service.impl;

import cn.ld.peach.mall.commons.lang.constant.WhetherEnum;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import cn.ld.peach.mall.goods.domain.comment.CommentInfo;
import cn.ld.peach.mall.goods.domain.dto.CommentInfoDTO;
import cn.ld.peach.mall.goods.mapper.comment.CommentInfoMapper;
import cn.ld.peach.mall.goods.service.CommentPictureService;
import cn.ld.peach.mall.goods.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 评论信息服务层
 *
 * @author lidong
 * @date 2021/3/30
 */
@Slf4j
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentInfoMapper commentInfoMapper;
    @Resource
    private CommentPictureService commentPictureService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveCommentInfo(CommentInfoDTO commentInfoDTO) {
        //设置一些默认值
        commentInfoDTO.setId(null);
        commentInfoDTO.setCreateTime(new Date());
        commentInfoDTO.setUpdateTime(new Date());

        commentInfoMapper.insert(BeanCopierUtil.copy(commentInfoDTO, CommentInfo.class));

        //TODO 处理插入图片逻辑，上面的插入要返回插入后的ID
        if (Objects.nonNull(commentInfoDTO.getIsShowPictures())
                && commentInfoDTO.getIsShowPictures() == WhetherEnum.YES.getCode()) {
            commentPictureService.saveCommentPicture(ThreadLocalRandom.current().nextLong(100),
                    commentInfoDTO.getFiles());
        }
    }
}
