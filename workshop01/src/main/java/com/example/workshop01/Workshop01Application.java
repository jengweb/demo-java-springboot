package com.example.workshop01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.*;

@SpringBootApplication
public class Workshop01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(Workshop01Application.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			out.println(bean);
		}
		out.println(context.getBeanDefinitionCount());

		Demo demo = context.getBean(Demo.class);
		demo.setName("Somkiat");
		demo.hi();

		Demo demo2 = context.getBean(Demo.class);
		demo2.setName("A");
		demo2.hi();
		demo.hi();
	}

}
