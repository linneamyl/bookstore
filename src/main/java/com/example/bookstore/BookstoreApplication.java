package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;


@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of categories");
			crepository.save(new Category("Poetry"));
			crepository.save(new Category("Romantic novel"));
			crepository.save(new Category("Horror"));
			
			
			log.info("save a couple of books");
			repository.save(new Book(0, "A Farewell to Arms", "Ernest Hemingway",1929, "1232323-21", 20.00, crepository.findByName("Poetry").get(0)));
			repository.save(new Book(0, "Animal Farm", "George Orwell", 1945, "2212343-5", 50.00, crepository.findByName("Romantic novel").get(0)));	
			//repository.deleteAll();
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}
}

