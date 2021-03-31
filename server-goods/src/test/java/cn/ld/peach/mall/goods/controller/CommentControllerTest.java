package cn.ld.peach.mall.goods.controller;

import cn.ld.peach.mall.goods.BaseTest;
import cn.ld.peach.mall.goods.domain.vo.CommentInfoVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * 評論controller test
 *
 * @author lidong
 * @date 2021/3/31
 */
@Slf4j
public class CommentControllerTest extends BaseTest {

    @Test
    public void publishCommentTest() throws Exception {
        CommentInfoVO request = new CommentInfoVO();
        request.setGoodsId(1L);
        request.setOrderId(1L);

        getMockMvc().perform(MockMvcRequestBuilders.post("/comment/publishComment")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(request)))
                .andDo(System.out::println);
    }
}
