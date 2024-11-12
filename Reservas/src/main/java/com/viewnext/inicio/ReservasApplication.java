package com.viewnext.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages="com.viewnext.model")
@EnableJpaRepositories(basePackages="com.viewnext.repository")
@SpringBootApplication(scanBasePackages= {"com.viewnext.contoller", "com.viewnext.service"})
public class ReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
}
