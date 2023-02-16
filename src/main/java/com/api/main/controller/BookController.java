package com.api.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.main.entities.Book;
import com.api.main.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
//	gives all books 
	@GetMapping("/books")
	public List<Book> getbooks() {
		return this.bookService.getAll();
	}
	
//	give book by id
	@GetMapping("/books/{id}")
	public Book getbook(@PathVariable("id") int id) {
		return this.bookService.getById(id);
	}
	
//	add the book
	@PostMapping("/books")
	public Book addbook(@RequestBody Book book) {
		Book b=this.bookService.addBook(book);
		return b;
	}
	
//	delete book
	@DeleteMapping("/books/{bid}")
	public void deleteBook(@PathVariable("bid") int bid) {
		this.bookService.deleteBook(bid);
	}
	
//	update book
	@PutMapping("/books/{bid}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bid") int bid) {
		this.bookService.updateBook(book,bid); 
	}
}
