package com.ghazal.applicationcontext.controllers;

import com.ghazal.applicationcontext.services.GreetingService;
import com.ghazal.applicationcontext.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello()
    {
        System.out.println("In my Controller");
        return "Say Hello from MyController";
    }
}
