package cn.ld.peach.mall.commons.config;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 配置中心配置
 * 自动注入引用的spring boot项目中
 *
 * @author lidong
 * @date 2021/3/27
 */
@Configuration
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
@NacosPropertySource(dataId = "${spring.application.name}.properties", autoRefreshed = true)
@Import(ConfigCenterProperties.class)
public class ConfigCenterConfiguration {
}
