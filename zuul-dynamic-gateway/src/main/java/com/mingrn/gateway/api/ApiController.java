package com.mingrn.gateway.api;

import com.mingrn.gateway.event.RefreshRouteService;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 14/10/2018 18:19
 */
@RestController
public class ApiController {

	@Resource
	private ZuulHandlerMapping zuulHandlerMapping;

	@Resource
	private RefreshRouteService refreshRouteService;

	@RequestMapping("/refreshRoute")
	public String refreshRoute() {
		refreshRouteService.refreshRoute();
		return "refreshRoute...";
	}

	@RequestMapping("/watchNowRoute")
	public String watchNowRoute() {
		//可以用debug模式看里面具体是什么
		Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
		return "watchNowRoute";
	}

}
