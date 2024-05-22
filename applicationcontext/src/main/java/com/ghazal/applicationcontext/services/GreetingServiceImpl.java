package com.ghazal.applicationcontext.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Saying greetings from greetingService";
    }
}
