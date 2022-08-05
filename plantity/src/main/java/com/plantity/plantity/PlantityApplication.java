package com.plantity.plantity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PlantityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantityApplication.class, args);
		// DB 나오도록 코드 짜보기
	}

}
