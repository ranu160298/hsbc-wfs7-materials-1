package com.example.springmsrevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMsRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsRevisionApplication.class, args);
	}

}
