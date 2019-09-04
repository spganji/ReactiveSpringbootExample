package com.reactive;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

// this is not needed, it is to print the output on console 
public class GreetingWebClient {
	
	private WebClient client = WebClient.create("http://localhost:8080");

	private Mono<ClientResponse> result = client.get()
		.uri("/hello")
		.accept(MediaType.TEXT_PLAIN)
		.exchange();

	public String getResult() {
		return ">> result hi test6 = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
	}

}
