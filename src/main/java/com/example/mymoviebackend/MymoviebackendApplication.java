package com.example.mymoviebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class MymoviebackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymoviebackendApplication.class, args);
	}

}
