package edu.wctc.spring.services;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("In FileLogger print method " + message);
    }
}
