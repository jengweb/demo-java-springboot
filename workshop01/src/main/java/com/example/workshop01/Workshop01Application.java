package com.example.workshop01;

import com.example.workshop01.user.MyUser;
import com.example.workshop01.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

import static java.lang.System.*;

@SpringBootApplication
public class Workshop01Application {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialData() {
		MyUser demoUser = new MyUser(123, "demo Jengweb", 34);
		userRepository.save(demoUser);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder().build();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(Workshop01Application.class, args);
//		String[] beans = context.getBeanDefinitionNames();
//		for (String bean : beans) {
//			out.println(bean);
//		}
		out.println(context.getBeanDefinitionCount());

		Demo demo = context.getBean(Demo.class);
		demo.setName("Jengweb");
		demo.hi();

		Demo demo2 = context.getBean(Demo.class);
		demo2.setName("A");
		demo2.hi();
		demo.hi();
	}

}
