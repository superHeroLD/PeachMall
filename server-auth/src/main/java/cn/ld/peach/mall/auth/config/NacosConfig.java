package cn.ld.peach.mall.auth.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * Nacos 配置中心
 *
 * @author lidong
 * @date 2021/3/26
 */
@Getter
@Component
public class NacosConfig {

    @NacosValue(value = "${app.name}", autoRefreshed = true)
    private String appName;
}
