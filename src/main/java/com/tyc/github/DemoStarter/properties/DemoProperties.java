package com.tyc.github.DemoStarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类描述
 *
 * @author tyc
 * @version 1.0
 * @date 2024-01-11 15:09:36
 */
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
    /**
     * 名称
     */
    private String name;

    /**
     * 年纪
     */
    private Integer age = 18;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
