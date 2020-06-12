package com.lwt.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@EnableDiscoveryClient
@NacosPropertySource(dataId = "springboot-nacos-config",autoRefreshed = true)
@SpringBootApplication
@RestController
public class SpringbootNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootNacosApplication.class, args);
	}
	
	 @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
	    private String testProperties;

	 @GetMapping("/test")
	 public String test(){
	    return testProperties;
	 }

}
