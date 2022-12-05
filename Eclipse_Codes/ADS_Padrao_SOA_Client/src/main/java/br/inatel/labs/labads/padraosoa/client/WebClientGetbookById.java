package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientGetbookById {

public static void main(String[] args) {
		
		Mono<BookDTO> monoBook = WebClient.create("http://localhost:8081")
				.get()
				.uri("/book/1")
				.retrieve()
				.bodyToMono(BookDTO.class);
		
		monoBook.subscribe();
		
		BookDTO dto = monoBook.block(); //Fica bloqueado ate que receba tudo
		
		System.out.print(dto);
	}
}
