package com.bootstrap.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
//@ComponentScan
public class BootstrapAutoconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapAutoconfigurationApplication.class, args);
	}

}
