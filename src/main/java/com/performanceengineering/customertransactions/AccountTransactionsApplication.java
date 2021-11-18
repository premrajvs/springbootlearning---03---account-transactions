package com.performanceengineering.customertransactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountTransactionsApplication.class, args);
	}

}
