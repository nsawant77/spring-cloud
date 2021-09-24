package com.practice.microservices.limitservice.controller;

import com.practice.microservices.limitservice.bean.ApplicationPropertiesConfig;
import com.practice.microservices.limitservice.bean.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    @Autowired
    ApplicationPropertiesConfig applicationPropertiesConfig;

    @GetMapping("/limits")
    public Limit retriveLimits(){
        return new Limit(applicationPropertiesConfig.getMinimum(), applicationPropertiesConfig.getMaximum());
    }
}
