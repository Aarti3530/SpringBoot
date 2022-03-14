package com.example.firstproj;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	int age;
	public void code() {
		System.out.println("Hey!!!" + age);
	}
	public void setAge(int age) {
		this.age = age;
	}

}
