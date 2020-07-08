package com.web.UserFeedbackApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.web")
@EntityScan(basePackages = "com")
@EnableJpaRepositories(basePackages ="com")
public class UserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedbackApplication.class, args);
	}
}
