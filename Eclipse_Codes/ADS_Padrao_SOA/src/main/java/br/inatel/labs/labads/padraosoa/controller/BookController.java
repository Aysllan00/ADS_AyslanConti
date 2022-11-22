

package br.inatel.labs.labads.padraosoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import br.inatel.labs.labads.padraosoa.model.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired(required=true)
	private BookService service;
	
	@GetMapping
	public List<Book> getAllBook(){
		List<Book> books = service.searchBook();
		return books;
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") Long bookId) {
		
		Optional<Book> optBook = service.findBookById(bookId);
		if(optBook.isPresent()){
			Book book = optBook.get();
			return book;
		}
		else {
			String msgErro = "Doesn't exist this page";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, msgErro);
		}
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book postBook(@RequestBody Book newBook) { //Converter o json em um objeto - injeção de dependencia
		
		Book createBook = service.CreateBook(newBook);
		return createBook;
		
	}
}
