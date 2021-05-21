package com.mingrn.gateway.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 网关实体类
 *
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 14/10/2018 17:13
 */
public class SysGateway implements Serializable {

	private static final long serialVersionUID = -1L;


	/**
	 * 主键
	 */
	private String id;

	/**
	 * 网关应用名称
	 */
	private String appName;

	/**
	 * 路由规则
	 */
	private String path;

	/**
	 * 服务id,如：hello-service。与 url 只能存在一个。
	 */
	private String serviceId;

	/**
	 * 服务地址，如：http://localhost:8080。与 服务ID 只能存在一个
	 */
	private String url;

	/**
	 * 是否开启重试机制
	 */
	private Boolean retryable;

	/**
	 * 是否剥离路由前缀
	 */
	private Boolean stripPrefix;

	/**
	 * 是否开启敏感头信息
	 */
	private Boolean customSensitiveHeaders;

	/**
	 * 是否立即启用路由
	 */
	private Boolean applyEnable;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 是否已删除
	 */
	private Boolean deleted;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 说明
	 */
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getRetryable() {
		return retryable;
	}

	public void setRetryable(Boolean retryable) {
		this.retryable = retryable;
	}

	public Boolean getStripPrefix() {
		return stripPrefix;
	}

	public void setStripPrefix(Boolean stripPrefix) {
		this.stripPrefix = stripPrefix;
	}

	public Boolean getCustomSensitiveHeaders() {
		return customSensitiveHeaders;
	}

	public void setCustomSensitiveHeaders(Boolean customSensitiveHeaders) {
		this.customSensitiveHeaders = customSensitiveHeaders;
	}

	public Boolean getApplyEnable() {
		return applyEnable;
	}

	public void setApplyEnable(Boolean applyEnable) {
		this.applyEnable = applyEnable;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
