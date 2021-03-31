package cn.ld.peach.mall.goods.controller;

import cn.ld.peach.mall.commons.lang.base.ResultT;
import cn.ld.peach.mall.commons.lang.constant.CommentStatus;
import cn.ld.peach.mall.commons.lang.constant.CommentType;
import cn.ld.peach.mall.commons.lang.constant.WhetherEnum;
import cn.ld.peach.mall.commons.lang.util.BeanCopierUtil;
import cn.ld.peach.mall.goods.domain.dto.CommentInfoDTO;
import cn.ld.peach.mall.goods.domain.vo.CommentInfoVO;
import cn.ld.peach.mall.goods.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * 评论Controller
 *
 * @author lidong
 * @date 2021/3/30
 */
@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @PostMapping("/publishComment")
    @SuppressWarnings("unchecked")
    public ResultT<Void> publishComment(@RequestBody CommentInfoVO commentInfoVO, MultipartFile[] files) {
        checkArgument(Objects.nonNull(commentInfoVO), "commentInfoVO is null");

        CommentInfoDTO commentInfoDTO = BeanCopierUtil.copy(commentInfoVO, CommentInfoDTO.class);

        //TODO 处理上传图片
        if (Objects.nonNull(files) && files.length > 0) {
            for (MultipartFile file : files) {
                if (Objects.nonNull(file) && !file.isEmpty()) {
                    commentInfoDTO.setIsShowPictures(WhetherEnum.YES.getCode());
                    commentInfoDTO.setFiles(files);
                    break;
                }
            }
        }

        int totalScore = Math.round((commentInfoVO.getGoodsScore()
                + commentInfoVO.getLogisticsScore() + commentInfoVO.getCustomerServiceScore()) / 3);
        commentInfoDTO.setTotalScore(totalScore);
        commentInfoDTO.setIsDefaultComment(WhetherEnum.NO.getCode());
        commentInfoDTO.setCommentStatus(CommentStatus.APPROVING.getCode());
        commentInfoDTO.setCommentType(CommentType.getCommentTypeByScore(totalScore).getCode());

        commentService.saveCommentInfo(commentInfoDTO);
        return ResultT.success();
    }
}
