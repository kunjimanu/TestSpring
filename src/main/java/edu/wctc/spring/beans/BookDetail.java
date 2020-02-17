package edu.wctc.spring.beans;

import edu.wctc.spring.services.Logger;

public class BookDetail {
    private int bookId;
    private String author;
    private String publisher;
    private Logger loggerService;
    public BookDetail() {
    }

    public BookDetail(Logger logger) {
        this.loggerService = logger;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void logChange(){
        loggerService.log("Log from the Book Detail Domain Class");
    }
}
