package com.practise.helloconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HelloConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloConfigClientApplication.class, args);
	}

}
