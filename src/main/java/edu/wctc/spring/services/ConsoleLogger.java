package edu.wctc.spring.services;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("In Console Logger " + message);
    }
}
