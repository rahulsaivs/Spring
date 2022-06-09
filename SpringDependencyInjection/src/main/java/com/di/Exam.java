package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String args[])
	{
		//injecting the value for dependency name(normal way) 
	@SuppressWarnings("resource")
	ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
	Students s2=a.getBean("s2",Students.class);
	s2.display();
	
	/*Student s2=c.getBean("s2",Student.class);
	s2.display();*/
	}

}
