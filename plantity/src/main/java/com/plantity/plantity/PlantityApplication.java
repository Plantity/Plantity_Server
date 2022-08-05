package com.plantity.plantity;

import com.plantity.domain.User;
import com.plantity.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class PlantityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantityApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			User user1 = new User("social", "rating", 0, "status");

			// data 저장
			repository.save(user1);

			// 조회
			List<User> courseList =  repository.findAll();

		};
	}

}
