package com.uc.demom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemomApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomApplication.class, args);
	}

}
