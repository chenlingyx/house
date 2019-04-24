 package com.cl.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author chenling
 * @date 2018/12/21
 */
@SpringBootApplication
@EnableAdminServer
public class AdminApplication {

		public static void main(String[] args) {
			SpringApplication.run(AdminApplication.class, args);
		}
	}
