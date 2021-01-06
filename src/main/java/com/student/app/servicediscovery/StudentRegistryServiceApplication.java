package com.student.app.servicediscovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class StudentRegistryServiceApplication {


	public static void main(String[] args) {
		log.info("Inside the main method");
		log.info("added dockerfile");
		SpringApplication.run(StudentRegistryServiceApplication.class, args);
	}

}
