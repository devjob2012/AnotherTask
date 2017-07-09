package co.uk.spring.boot.task.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.uk.spring.boot.task.*")
public class TaskOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskOneApplication.class, args);
	}
}
