package com.ustgloabl.streams.list;

import java.util.ArrayList;

public class TestS 
{
	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1,"Suhel", 95.45));
		al.add(new Student(1,"Suhel", 30.45));
		al.add(new Student(1,"Suhel", 45.45));
		al.add(new Student(1,"Suhel", 30.45));
		al.add(new Student(1,"Suhel", 99.45));
		al.add(new Student(1,"Suhel", 46.45));
		
		System.out.println("****All Students******");
		help h = new help();
		h.displayAllStudent(al);
		System.out.println("*****failed students*****");
		h.displayFailedStudents(al);
		System.out.println("*****passed students*****");
		h.displaypassedStudents(al);
		System.out.println("*****Topper students*****");
		h.displaytopperStudents(al);
		
		
	}
}
