package com.di2;

public class Another_student {
	//Dependency in objects
	Cheat c;
	//setters method for DI
	public void setC(Cheat c) {
		this.c = c;
	}

	public void cheating()
	{
		c.mathCheat2();
	}
			
}