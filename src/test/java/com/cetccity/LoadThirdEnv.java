package com.cetccity;
/**
 * Created by Administrator on 2017/5/11.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

/**
 * DATE 2017/5/11
 * AUTHOR JIANGXP
 * DESCRIPTION LoadThirdEnv
 */
//public class LoadThirdEnv implements EnvironmentPostProcessor, Ordered
//{
//	@Override
//	public void postProcessEnvironment(ConfigurableEnvironment environment,
//			SpringApplication springApplication)
//	{
//		//此处可以http方式 到配置服务器拉取一堆公共配置+本项目个性配置的json串,拼到Properties里//......省略new Properties的过程
//		MutablePropertySources propertySources = environment.getPropertySources();
//		//addLast 结合下面的 getOrder() 保证顺序 读者也可以试试其他姿势的加载顺序
//		propertySources.addLast(new PropertiesPropertySource("thirdEnv", properties));
//	}
//
//	@Override
//	public int getOrder()
//	{
//		//  +1 保证application.propertie里的内容能覆盖掉本配置文件中默认的// 如果不想被覆盖 可以去掉 +1  或者 -1  试试
//		return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
//	}
//	//return 0;
//}
