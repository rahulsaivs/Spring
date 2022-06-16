package com.example.springstarterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springstarterproject1.entities.Student;

@SpringBootApplication
public class SprinStarterProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext a =SpringApplication.run(SprinStarterProject1Application.class, args);
		Student s = a.getBean(Student.class);
		//Student s=new Student();
		s.display();
	}

}