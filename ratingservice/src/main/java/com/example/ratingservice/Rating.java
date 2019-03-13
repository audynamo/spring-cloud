package com.example.ratingservice;

public class Rating {
    private Long id;
    private Long bookId;
    private int stars;

    public Rating(Long id, Long bookId, int stars) {
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    public Long getBookId() {
        return bookId;
    }
}
