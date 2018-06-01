package com.learn.myself.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MySampleRestController {
    @Autowired
    private Environment env;

    @Value("${foo}")
    private String foo;

    @RequestMapping("/get")
    public String getAppName() {
        return env.getProperty("foo", "undefined");
    }
}
