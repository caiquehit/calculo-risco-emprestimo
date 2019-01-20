package br.com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan({"br.com"})
@EntityScan("br.com.model")
@EnableJpaRepositories("br.com.repository")
@EnableAutoConfiguration
public class Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
