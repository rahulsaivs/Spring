package com.di;

public class Students
{
	
	private String StudentName;
	private int id;
	//constructor injection
	public Students(String studentName,int id ) {
		super();
		
		StudentName = studentName;
		this.id = id;
	}


	
	public void display()
	{
		System.out.println("Name of the student is: "+StudentName +" and ID is: "+id );
	}

}