package edu.wctc;


public class GreetingServiceImpl implements GreetingService {

    public void greet(String message) {
        System.out.println("Greetings! " + message);
    }
}
