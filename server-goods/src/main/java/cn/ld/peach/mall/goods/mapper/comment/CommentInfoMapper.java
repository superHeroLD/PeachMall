package cn.ld.peach.mall.goods.mapper.comment;

import cn.ld.peach.mall.goods.domain.comment.CommentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论信息Dao层
 *
 * @author lidong
 * @date 2021/3/29
 */
@Mapper
public interface CommentInfoMapper extends BaseMapper<CommentInfo> {
}
