package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootHelloWorldApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootHelloWorldApplication.class, args);

		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
