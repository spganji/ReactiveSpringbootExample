package com.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveHelloApplication.class, args);
		//GreetingWebClient gwc = new GreetingWebClient();
		//System.out.println(gwc.getResult());
		
	}

}
