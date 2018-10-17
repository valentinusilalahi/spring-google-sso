package com.silalahi.valentinus.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
public class SpringGoogleSsoApplication {

	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGoogleSsoApplication.class, args);
	}
}
