package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.demo.*")
@EnableJpaRepositories("com.demo.*")
@ComponentScan("com.demo.*")
public class HelloWorld1Application {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld1Application.class, args);
	}
}