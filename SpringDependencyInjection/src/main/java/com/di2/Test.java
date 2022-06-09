package com.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.di.Students;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		Student1 s1=a.getBean("s1",Student1.class);
		s1.cheating();
		
		Another_student  s2=a.getBean("s2",Another_student .class);
		s2.cheating();

	}

	}