package com.example.firstproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ApplicationContext con =
		SpringApplication.run(FirstProjApplication.class, args);
		
		Alien obj = con.getBean(Alien.class);
		obj.setAge(10);
		obj.code();
		
		
	}

}
