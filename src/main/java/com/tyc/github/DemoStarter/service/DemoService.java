package com.tyc.github.DemoStarter.service;

import com.tyc.github.DemoStarter.properties.DemoProperties;

/**
 * 类描述
 *
 * @author tyc
 * @version 1.0
 * @date 2024-01-11 15:19:31
 */
public class DemoService {
    private DemoProperties demoProperties;

    public DemoService(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    public String hello(){
        return "hello " + demoProperties.getName();
    }
}
