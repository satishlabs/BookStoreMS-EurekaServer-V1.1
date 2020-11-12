package com.userratings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class UserRatingMsApplication implements CommandLineRunner{
	static Logger log=LoggerFactory.getLogger(UserRatingMsApplication.class); 
	
	public static void main(String[] args) {
		log.info(" UserRatingMS  - Begin "); 
		SpringApplication.run(UserRatingMsApplication.class, args);
		log.info(" UserRatingMS  - End "); 
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(" UserRatingMS  - Launched.... "); 
		
	}

}
