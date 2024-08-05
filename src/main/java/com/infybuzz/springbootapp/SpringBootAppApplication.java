package com.infybuzz.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.infybuzz.controller", "com.infybuzz.service" })
@EntityScan({"com.infybuzz.entity"})
@EnableJpaRepositories({"com.infybuzz.repository"})
@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
