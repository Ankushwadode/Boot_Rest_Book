package com.api.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.main.entities.Book;

@Component
public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(101,"python Complete reference","xyz"));
		list.add(new Book(102,"html,css,js complete reference","qwe"));
		list.add(new Book(103,"cloude computing","dfg"));
	}
	
//	getting all books 
	public List<Book> getAll(){
		return list;
	}
	
//	getting book by id
	public Book getById(int id) {
		Book book=null;
		book=list.stream().filter(e->e.getPid()==id).findFirst().get();
		return book;
	}
	
//	adding book
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

//	delete book
	public void deleteBook(int bid) {
		list=list.stream().filter(book->book.getPid()!=bid).collect(Collectors.toList());
	}

//	update book
	public void updateBook(Book book, int bid) {
		
		
	}
	
}
