package com.cetccity;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(DemoApplication.class, args);

	}



	@Bean
	public AnnotationBean motanAnnotationBean() {
		AnnotationBean motanAnnotationBean = new AnnotationBean();
		motanAnnotationBean.setPackage("com.cetccity.sms.controller");
		return motanAnnotationBean;
	}

	@Bean(name = "demoMotan")
	public ProtocolConfigBean protocolConfig1() {
		ProtocolConfigBean config = new ProtocolConfigBean();
		config.setDefault(true);
		config.setName("motan");
		config.setMaxContentLength(1048576);
		return config;
	}

	@Bean(name = "my_zookeeper")
	public RegistryConfigBean registryConfig() {
		RegistryConfigBean config = new RegistryConfigBean();
		config.setRegProtocol("zookeeper");
		config.setAddress("192.168.1.65:2181");

		return config;
	}


	@Bean(name = "motantestClientBasicConfig")
	public BasicRefererConfigBean baseRefererConfig() {
		BasicRefererConfigBean config = new BasicRefererConfigBean();
		config.setProtocol("demoMotan");
		config.setGroup("motan-demo-rpc");
		config.setModule("motan-demo-rpc");
		config.setApplication("myMotanDemo");
		config.setRegistry("my_zookeeper");
		config.setCheck(false);
		config.setAccessLog(true);
		config.setRetries(2);
		config.setThrowException(true);
		return config;
	}

}
