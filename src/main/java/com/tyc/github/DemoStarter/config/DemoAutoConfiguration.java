package com.tyc.github.DemoStarter.config;

import com.tyc.github.DemoStarter.properties.DemoProperties;
import com.tyc.github.DemoStarter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tyc
 * @version 1.0
 * @date 2024-01-11 15:11:53
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
/**
 * @ConditionalOnProperty控制自动配置是否生效
 * 部分参数说明
 * prefix：配置文件的属性名前缀
 * havingValue：比较获取到的属性值与该值指定的值相同的时候才加载配置
 * matchIfMissing：缺少该配置属性值是否可以加载，true可以。false不可以，默认是false
 * name： 需要在引入的依赖匹配到对应属性才能配置生效
 */
@ConditionalOnProperty(prefix = "demo",name = "name",matchIfMissing = false)
public class DemoAutoConfiguration {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService(){
        return new DemoService(demoProperties);
    }
}
