package br.inatel.labs.labads.padraosoa.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

public class WebClientGetAllBooks_Flux {

public static void main(String[] args) {
	
		List<BookDTO> bookList = new ArrayList<>();
		
		Flux<BookDTO> fluxBook = WebClient.create("http://localhost:8081")
				.get()
				.uri("/book")
				.retrieve()
				.bodyToFlux(BookDTO.class); //Instancia ser o array, pois retorna um objeto
		
		fluxBook.subscribe(b -> bookList.add(b));
		
		fluxBook.blockLast(); //Bloqueia ate o ultimo bloco chegar
		bookList.forEach(System.out::println);
	}
}
