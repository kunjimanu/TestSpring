package edu.wctc.spring;

import edu.wctc.spring.beans.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp{

    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // retrieve bean from Spring container
        Book theBook = context.getBean("mybook", Book.class);

        // call methods on the bean
        theBook.logChange();

        // call getters for literal values
        System.out.println(theBook.getBookid());
        System.out.println(theBook.getCategory());
        System.out.println(theBook.getIsbn());
        System.out.println(theBook.getTitle());

        // close the context
        context.close();
    }
}
