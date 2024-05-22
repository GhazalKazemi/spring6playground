package com.ghazal.applicationcontext;

import com.ghazal.applicationcontext.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationcontextApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ApplicationcontextApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		System.out.println("In Main method");
		System.out.println(myController.sayHello());
	}

}
