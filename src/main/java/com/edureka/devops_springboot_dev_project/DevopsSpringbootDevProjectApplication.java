package com.edureka.devops_springboot_dev_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsSpringbootDevProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsSpringbootDevProjectApplication.class, args);
	}

	@GetMapping("/")
	public String WelcomeMsg() {
		return "<h1>Hello there finally !</h1>";
	}
	
	@GetMapping("/inbox")
	public String inboxMsg() {
		return "<h1>This is Inbox !</h1>";
	}
	
	@GetMapping("/outbox")
	public String outboxMsg() {
		return "<h1>This is Outbox !</h1>";
	}
}
