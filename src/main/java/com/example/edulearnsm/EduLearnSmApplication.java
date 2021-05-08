package com.example.edulearnsm;

import com.example.edulearnsm.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class EduLearnSmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduLearnSmApplication.class, args);
	}

}
