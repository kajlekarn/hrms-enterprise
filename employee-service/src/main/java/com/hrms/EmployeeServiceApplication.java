package com.hrms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication implements CommandLineRunner {

	private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Employee Service is UP!... ACCEPTING TRAFFIC NOW!!");
	}
}
