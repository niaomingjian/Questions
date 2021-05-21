package com.mingrn.gateway.config;

import com.mingrn.gateway.zuul.CustomDynamicRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * 自定义动态路由配置
 *
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 14/10/2018 17:49
 */
@Configuration
public class CustomDynamicRouteConfig {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Resource
	private ZuulProperties zuulProperties;

	@Autowired
	DispatcherServletPath dispatcherServletPath;

	@Resource
	private ServerProperties serverProperties;

	@Autowired
	private MongoTemplate mongoTemplate;
	@Bean
	public CustomDynamicRouteLocator routeLocator() {
		CustomDynamicRouteLocator routeLocator = new CustomDynamicRouteLocator(dispatcherServletPath.getPrefix(), this.zuulProperties);
		routeLocator.setJdbcTemplate(jdbcTemplate);
		System.out.println(mongoTemplate);
		return routeLocator;
	}

}