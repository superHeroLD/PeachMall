package cn.ld.peach.mall.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 权限中心
 *
 * @author lidong
 * @date 2021/3/23
 */
@SpringBootApplication
@MapperScan("cn.ld.peach.mall.auth.mapper")
public class ServerAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerAuthApplication.class, args);
    }
}
