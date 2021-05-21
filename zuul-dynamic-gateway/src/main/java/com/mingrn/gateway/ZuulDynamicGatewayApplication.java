package com.mingrn.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableZuulProxy
@SpringBootApplication
public class ZuulDynamicGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulDynamicGatewayApplication.class, args);
	}
}
