package com.relationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
private List<Book> book;
	
	public Library() {
		this.book = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		this.book.add(book);
	}
	
	public List<Book> getBook(){
		return this.book;
	}
}
