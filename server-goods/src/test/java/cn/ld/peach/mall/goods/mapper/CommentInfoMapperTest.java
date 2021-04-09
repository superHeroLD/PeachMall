package cn.ld.peach.mall.goods.mapper;

import cn.ld.peach.mall.goods.BaseTest;
import cn.ld.peach.mall.goods.domain.comment.CommentInfo;
import cn.ld.peach.mall.goods.mapper.comment.CommentInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论测试类
 *
 * @author lidong
 * @date 2021/3/29
 */
@Slf4j
public class CommentInfoMapperTest extends BaseTest {

    @Resource
    private CommentInfoMapper commentInfoMapper;

    @Test
    public void testSelectList() {
        List<CommentInfo> commentInfoList = commentInfoMapper.selectList(null);
        log.info("commentInfoList: {}", commentInfoList);
    }
}
