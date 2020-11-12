package com.placeorder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
@EnableEurekaClient
public class PlaceOrderMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println(" PlaceOrderMS - Begin ");
		SpringApplication.run(PlaceOrderMsApplication.class, args);
		System.out.println(" PlaceOrderMS - End ");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" PlaceOrderMS - Launched.... ");
	}

}
