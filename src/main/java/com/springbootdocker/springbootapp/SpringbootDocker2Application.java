package com.springbootdocker.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDocker2Application {
	@GetMapping
	public String getmsg()
	{
		return "this is my first docker containers and edited on git";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDocker2Application.class, args);
	}

}
