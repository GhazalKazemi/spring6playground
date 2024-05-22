package com.ghazal.applicationcontext.controllers;

import com.ghazal.applicationcontext.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {

    private PropertyInjectorController propertyInjectorController;
    @BeforeEach
    void setUp() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectorController.sayHello());
    }
}