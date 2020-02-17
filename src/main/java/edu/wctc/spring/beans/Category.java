package edu.wctc.spring.beans;

import edu.wctc.spring.services.Logger;

public class Category {
    private String categoryname;
    private Logger loggerService;

    public Category() {
    }

    public Category(Logger logger) {
        this.loggerService = logger;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public void logChange(){
        loggerService.log("Log from the Category Domain Class");
    }
}
