package com.practice.microservices.limitservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@ComponentScan (basePackages = "com.practice.microservices.limitservice")
public class LimitServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(LimitServiceApplication.class, args);
	}

}
