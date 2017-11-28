package com.cetccity.athena.service;
/**
 * Created by Administrator on 2017/5/9.
 */

import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * DATE 2017/5/9
 * AUTHOR JIANGXP
 * DESCRIPTION smssender
 */
@MotanAsync
public interface SmsSender
{
	String sendSmsIdentifyingCode(String phoneNumber);
}
