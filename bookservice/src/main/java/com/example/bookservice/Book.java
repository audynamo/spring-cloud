package com.example.bookservice;

public class Book {
    private Long id;
    private String author;
    private String title;
    public Book(Long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Long getId() {
        return id;
    }
}
