 package com.cl.house.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableDiscoveryClient
@Controller
 public class ApiGetewayApplication {
  
	 public static void main(String[] args) {
		SpringApplication.run(ApiGetewayApplication.class, args);
	}
	 
	 @Autowired
	 private DiscoveryClient discoveryClient;
	 
	 /**
	  * 获取该客服端所有接口服务
	  * @return
	  */
	 @RequestMapping("index1")
	 @ResponseBody
	 public List<ServiceInstance> getRegisterService(){
		 return discoveryClient.getInstances("user-service");
	 }
}
