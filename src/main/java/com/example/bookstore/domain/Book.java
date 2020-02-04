package com.example.bookstore.domain;

public class Book {
		private String title;
		private String author;
		private int year;
		private String isbn;
		private double price;
	
		public Book(String title, String author, int year, String isbn, double price) {
			super();
			this.title = title;
			this.author = author;
			this.year = year;
			this.isbn = isbn;
			this.price = price;
		}

		public Book() {
			super();
		}

		public Book(String title, String author, int year, String isbn, double price) {
			super();
			this.title = title;
			this.author = author;
			this.year = year;
			this.isbn = isbn;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price="
					+ price + "]";
		}
		
		
		
		
}
