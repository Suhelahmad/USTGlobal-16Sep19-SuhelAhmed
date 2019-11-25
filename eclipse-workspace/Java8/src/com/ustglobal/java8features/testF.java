package com.ustglobal.java8features;

import java.util.function.Consumer;

public class testF 
{
	public static void main(String[] args)
	{
		Consumer<Student> c = s ->
		{
			System.out.println("ID is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.perc);
			System.out.println("========================");
		};
		Student s1 = new Student(2,"Suhel", 67.9);
		c.accept(s1);
	}
}
