package edu.wctc.spring.beans;

import edu.wctc.spring.services.Logger;

public class Book {

    private int bookid;
    private int isbn;
    private String title;
    private String category;

    private Logger loggerService;

    public Book() {
    }

    public Book(Logger logger) {
        this.loggerService = logger;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLoggerService(Logger loggerService) {
        this.loggerService = loggerService;
    }

    public void logChange(){
        loggerService.log("Log from the Book Domain Class");
    }
}
