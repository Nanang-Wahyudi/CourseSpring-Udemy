package com.BookCatalog.Service;

import com.BookCatalog.Domain.Author;
import com.BookCatalog.Domain.Book;

public class BookService {
	
	private Book book;

	public BookService(Book book) {
		Author author = new Author();
		book = new Book(author);
	}
	
	

}
