package com.example.dialy.bias.tool;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DailyBiasApplication {
	public static void main(String[] args) {
		SpringApplication.run(DailyBiasApplication.class, args);
	}
}