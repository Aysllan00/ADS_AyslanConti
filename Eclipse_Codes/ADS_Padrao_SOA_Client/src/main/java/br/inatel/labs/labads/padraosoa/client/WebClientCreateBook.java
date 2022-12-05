package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientCreateBook {

	public static void main(String[] args) {
		
			BookDTO newBook = new BookDTO();
			newBook.setTitle("Python");
			newBook.setCategory("Programação");
			
			Mono<BookDTO> monoBook = WebClient.create("http://localhost:8081")
					.post()
					.uri("/book")
					.bodyValue(newBook)
					.retrieve()
					.bodyToMono(BookDTO.class);
			
			monoBook.subscribe();
			
			BookDTO createBook = monoBook.block(); //Fica bloqueado ate que receba tudo
			
			System.out.println(createBook);

		}
}
