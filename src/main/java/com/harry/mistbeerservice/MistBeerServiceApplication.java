package com.harry.mistbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication
public class MistBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MistBeerServiceApplication.class, args);
	}

}
