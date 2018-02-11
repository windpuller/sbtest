package com.kuaikan.sbtestdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbtestDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtestDiscoveryApplication.class, args);
	}
}
