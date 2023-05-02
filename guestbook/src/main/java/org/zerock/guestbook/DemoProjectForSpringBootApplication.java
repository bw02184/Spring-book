package org.zerock.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoProjectForSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForSpringBootApplication.class, args);
	}

}
