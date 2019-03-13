package com.example.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/books")
public class BookserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

  private List<Book> bookList = Arrays.asList(
      new Book(1L, "ABC", "DEF"),
      new Book(2L, "XYZ", "DEI")
      );

  @GetMapping("")
  public List<Book> findAllBooks() {
    return bookList;
  }

  @GetMapping("/{bookId}")
  public Book findBook(@PathVariable Long bookId) {
    return bookList.stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);
  }
}
