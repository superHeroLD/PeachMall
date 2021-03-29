package cn.ld.peach.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 商品和评论中心
 *
 * @author lidong
 * @date 2021/3/23
 */
@SpringBootApplication
@MapperScan("cn.ld.peach.mall.goods.mapper")
public class ServerGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerGoodsApplication.class, args);
    }
}
