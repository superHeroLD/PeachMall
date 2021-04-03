package cn.ld.peach.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 订单中心
 *
 * @author lidong
 * @date 2021/3/23
 */
@SpringBootApplication
@MapperScan("cn.ld.peach.mall.order.mapper")
public class ServerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerOrderApplication.class, args);
    }
}
