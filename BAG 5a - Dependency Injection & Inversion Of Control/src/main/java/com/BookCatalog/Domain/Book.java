package com.BookCatalog.Domain;

public class Book {
	
//	Pembuatan Object Dengan Prinsip Dependency Injection
	private Author author;

	public Book(Author author) {
		super();
		this.author = author;
	}
	
	
	
}
