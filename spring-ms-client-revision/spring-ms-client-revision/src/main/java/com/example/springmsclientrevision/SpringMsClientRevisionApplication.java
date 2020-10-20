package com.example.springmsclientrevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMsClientRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsClientRevisionApplication.class, args);
	}

}
