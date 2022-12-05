package br.inatel.labs.labads.padraosoa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientUpdateBook {

	public static void main(String[] args) {
		
		BookDTO existingBook = new BookDTO();
		existingBook.setId(1L);
		existingBook.setTitle("Java");
		existingBook.setCategory("Programação");

		
		Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhost:8081")
				.put()
				.uri("/book")
				.bodyValue(existingBook)
				.retrieve()
				.toBodilessEntity();
		
		monoVoid.subscribe();
		
		ResponseEntity<Void> responseEntity = monoVoid.block(); //Fica bloqueado ate que receba tudo
		
		System.out.println(responseEntity.getStatusCode());

	}
}
