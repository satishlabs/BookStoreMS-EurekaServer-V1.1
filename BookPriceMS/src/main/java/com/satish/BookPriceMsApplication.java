package com.satish;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient 
public class BookPriceMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println(" BookPriceMS - Begin ");
		SpringApplication.run(BookPriceMsApplication.class, args);
		System.out.println(" BookPriceMS - End "); 
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" BookPriceMS - Launched.... "); 
	}

}
