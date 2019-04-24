 package com.cl.house.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenling
 * @date 2019/01/02
 */
 
// @Configuration
public class WebConfig {
    
	 @Value("${server.port}")
	 private Integer port;
	 
	 
	/*@Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(port);
            }
        };
    }*/
	
	
}
