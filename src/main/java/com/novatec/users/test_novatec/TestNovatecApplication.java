package com.novatec.users.test_novatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.novatec.users")
@EntityScan( basePackages ="com.novatec.users.entity")
public class TestNovatecApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestNovatecApplication.class, args);
	}

}
