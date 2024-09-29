package com.relationships.aggregation;

 

public class AggregationSample {
	
	public static void main(String arg[]) {
		Book book1 = new Book("Hello");
		Book book2 = new Book("Brave New World");
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		
		System.out.println("Book Count : " + library.getBook().size());
	}	

}
