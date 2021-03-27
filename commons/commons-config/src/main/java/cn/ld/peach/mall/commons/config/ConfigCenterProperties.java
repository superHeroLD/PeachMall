package cn.ld.peach.mall.commons.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置项
 * 区分环境
 *
 * @author lidong
 * @date 2021/3/27
 */
public class ConfigCenterProperties {

    @Profile("dev")
    @Configuration
    @PropertySource("classpath:config-dev.properties")
    public static class DevConfiguration {
    }

    @Profile("test")
    @Configuration
    @PropertySource("classpath:config-test.properties")
    public static class TestConfiguration {
    }


    @Profile("release")
    @Configuration
    @PropertySource("classpath:config-review.properties")
    public static class ReleaseConfiguration {
    }



    @Profile("prod")
    @Configuration
    @PropertySource("classpath:config-prod.properties")
    public static class ProdConfiguration {
    }
}
