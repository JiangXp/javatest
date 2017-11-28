package com.cetccity.athena.service.impl;
/**
 * Created by Administrator on 2017/5/10.
 */

import com.cetccity.athena.service.test;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * DATE 2017/5/10
 * AUTHOR JIANGXP
 * DESCRIPTION 
 */
@MotanService(export = "demoMotan:8002",registry = "registryConfig1",basicService = "baseServiceConfig")
public class testImpl implements test
{
	@Override
	public String test(String name)
	{
		return "test"+name;
	}
}
