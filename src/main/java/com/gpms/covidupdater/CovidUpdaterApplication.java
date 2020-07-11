package com.gpms.covidupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CovidUpdaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidUpdaterApplication.class, args);
	}

}
