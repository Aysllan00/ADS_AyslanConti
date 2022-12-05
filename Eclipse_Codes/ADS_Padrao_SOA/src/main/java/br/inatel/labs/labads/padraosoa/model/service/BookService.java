package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import br.inatel.labs.labads.padraosoa.model.entity.Book;

@Component("BookService")
public class BookService {
	
	private List<Book> bookList = new ArrayList<>();
	
	@PostConstruct
	public void setup() {
		Book b1 = new Book(1L, "Happy Potter", "Fantasia");
		Book b2 = new Book(2L, "Vinte Mil Leguas Submarinas", "Fantasia");
		Book b3 = new Book(3L, "Ponte para Terabitia", "Drama");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
	}

	
	public List<Book> searchBook(){
		return bookList;
	}
	
	public Optional<Book> findBookById(Long Id) {
		//Optinal é Wrapper - traz metodos para teste - isPresent() ou isEmpty() // Embrulho para proteger o codigo
		Optional<Book> bookEncontrado = bookList.stream()	//Mais recursos para trabalhar uma lista - Coleção
			.filter(b -> b.getId().equals(Id))              //Expressão lambda
			.findFirst(); //Do filtro traz o 1° - se não encontrar retorna um opcional
		
		return bookEncontrado;
	}
	
	public Book CreateBook(Book b) {
		
		Long idGerado = new Random().nextLong();
		b.setId(idGerado);
		
		bookList.add(b);
		
		return b;
	}
	
	public void updateBook(Book book) {
		bookList.remove(book);
		bookList.add(book);
	}
	
	public void delete(Book book) {
		bookList.remove(book);
	}
	
}
