CREATE TABLE `sys_gateway` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `app_name` varchar(32) NOT NULL COMMENT '网关应用名称',
  `path` varchar(64) NOT NULL COMMENT '路由规则，如：/hello-api/**',
  `service_id` varchar(64) DEFAULT NULL COMMENT '服务id，如：hello-service。与 url 只能存在一个。',
  `url` varchar(64) DEFAULT NULL COMMENT '服务地址，如：http://localhost:8080。与 服务ID 只能存在一个',
  `retryable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否开启重试机制。0：否，1：是',
  `strip_prefix` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否剥离路由前缀。0：否，1：是',
  `custom_sensitive_headers` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否开启敏感头信息。0：否，1：是',
  `apply_enable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否立即启用路由。0：否，1：是',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '状态。1：启用，2：禁用',
  `deleted` tinyint(1) NOT NULL COMMENT '是否已删除。0：否，1：是',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `description` text COMMENT '说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

