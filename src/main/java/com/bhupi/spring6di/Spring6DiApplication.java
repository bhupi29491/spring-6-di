package com.bhupi.spring6di;

import com.bhupi.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("I am in Main Method");

		System.out.println(controller.sayHello());
	}

}
