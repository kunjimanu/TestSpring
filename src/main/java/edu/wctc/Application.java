package edu.wctc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application  {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]
                {"application-context.xml"});
        GreetingService greeter = (GreetingService)
                context.getBean("Greeter");
        greeter.greet("I am your first Spring bean instance, configured purely with XML metadata. I am resolved by name.");
    }
}
