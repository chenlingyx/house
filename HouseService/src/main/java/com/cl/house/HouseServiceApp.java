 package com.cl.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenling
 * @date 2018/12/21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableEurekaClient
public class HouseServiceApp {

	 public static void main(String[] args) {
		 SpringApplication.run(HouseServiceApp.class, args);
	}
	 
}
