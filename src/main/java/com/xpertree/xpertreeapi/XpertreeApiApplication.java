package com.xpertree.xpertreeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(value="com.xpertree.*")
@ComponentScan(value="com.xpertreeapi.*")
@EntityScan(value="com.xpertree.*")
@EnableJpaRepositories(value="com.xpertree.organization")
public class XpertreeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(XpertreeApiApplication.class, args);
	}

}
