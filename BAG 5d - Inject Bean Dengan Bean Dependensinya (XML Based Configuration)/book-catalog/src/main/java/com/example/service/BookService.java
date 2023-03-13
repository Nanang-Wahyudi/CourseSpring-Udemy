package com.example.service;

import com.example.domain.Author;
import com.example.domain.Book;

public class BookService {

	private Book book;

	public BookService(Book book) {
		Author author = new Author();
		book = new Book(author);
	}
	
	
	
}
