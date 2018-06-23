package br.com.uds.trainee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.uds")

public class TraineeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeApplication.class, args);
	}
}
