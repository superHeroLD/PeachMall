package cn.ld.peach.mall.goods.mapper.comment;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论概要Dao层
 * 这个其实应该大数据去统计
 *
 * @author lidong
 * @date 2021/3/29
 */
@Mapper
public interface CommentAggregateMapper extends BaseMapper<CommentAggregateMapper> {
}
