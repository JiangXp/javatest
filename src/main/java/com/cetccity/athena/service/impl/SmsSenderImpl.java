package com.cetccity.athena.service.impl;
/**
 * Created by Administrator on 2017/5/10.
 */

import com.cetccity.athena.service.SmsSender;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * DATE 2017/5/10
 * AUTHOR JIANGXP
 * DESCRIPTION 
 */
@MotanService(export = "demoMotan:8002,demoMotan:8003",registry = "registryConfig1",basicService = "baseServiceConfig")
public class SmsSenderImpl implements SmsSender
{
	@Override
	public String sendSmsIdentifyingCode(String phoneNumber)
	{
		return "hellooOOOO";
	}
}
