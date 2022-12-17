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
<<<<<<< HEAD
		return "this is my first docker containers this is again building jar form spring and git";
=======
		return "this is my first docker containers and edited on git and waiting for updagtion";
>>>>>>> df4ff9442b6663cb3b2bd227ac6e186109e5ca4e
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDocker2Application.class, args);
	}

}
