package com.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // bean
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // dice al IoC container 
		// come creare l'oggetto
		// e avviare l'app
	}
	
	@RestController // per le richieste web
	public static class HelloWorld {
		@GetMapping("/hello")
		public String hello() {
			return "Hello World!"; // non html ma -> txt
		}
	}

}
