package com.mingrn.gateway.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.mingrn.gateway.event.RefreshRouteService;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

@Component
public class ScheduledTasks {

	@Resource
	private RefreshRouteService refreshRouteService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

	/**
	 * fixedDelay:5000表示当前方法执行完毕5000ms后,Spring scheduling会再次调用该方法
	 */
	/*@Scheduled(fixedDelay = 5000)
	public void testFixDelay() {
		LOGGER.info("===fixedDelay: 第{}次执行方法", fixedDelayCount++);
	}*/

	/**
	 * fixedRate:5000表示当前方法开始执行5000ms后,Spring scheduling会再次调用该方法
	 */
	/*@Scheduled(fixedRate = 5000)
	public void testFixedRate() {
		LOGGER.info("===fixedRate: 第{}次执行方法", fixedRateCount++);
	}*/

	/**
	 *initialDelay:1000表示延迟1000ms执行第一次任务
	 */
	/*@Scheduled(initialDelay = 1000, fixedRate = 5000)
	public void testInitialDelay() {
		LOGGER.info("===initialDelay: 第{}次执行方法", initialDelayCount++);
	}*/

	/**
	 * cron接受cron表达式,根据cron表达式确定定时规则
	 */
	@Scheduled(cron = "0/5 * * * * ? ")
	public void refreshRouteByCron() {
		refreshRouteService.refreshRoute();
		LOGGER.info("开始执行路由刷新事件 >>>>");
	}

}