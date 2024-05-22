package com.ghazal.applicationcontext;

import com.ghazal.applicationcontext.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationcontextApplicationTests {
	@Autowired
	ApplicationContext context;

	@Autowired
	MyController myController;

	@Test
	void myControllerInjectedTest() {
		System.out.println(myController.sayHello());
	}

	@Test
	void myControllerApplicationContextInjectionTest() {
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
