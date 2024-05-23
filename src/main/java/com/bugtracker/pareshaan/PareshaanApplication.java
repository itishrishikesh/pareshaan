package com.bugtracker.pareshaan;

import com.bugtracker.pareshaan.payload.BugDto;
import com.bugtracker.pareshaan.service.BugService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class PareshaanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PareshaanApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BugService bugService) {
		return args -> {
			bugService.saveBug(new BugDto(0L, "bug", "bug", null, null, null, null, null));
		};
	}
}
