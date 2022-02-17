package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		
		Student studentObj=context.getBean(Student.class);
		
		studentObj.show();
//		
//		Student studentObj1=context.getBean(Student.class);
//		
//		studentObj1.show();
	}

}
