package com.ghazal.applicationcontext.controllers;

import com.ghazal.applicationcontext.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.greet();
    }
}
