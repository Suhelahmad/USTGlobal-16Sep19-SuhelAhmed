package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Iterator;


public class TestA 
{
	public static void main(String[] args)
	{
		ArrayList<Student> s = new ArrayList<Student>();
		
		Student s1 = new Student(12,"suhel",35.6);
		Student s2 = new Student(12,"kayum",45.6);
		Student s3 = new Student(12,"fayum",98.3);
		Student s4 = new Student(12,"kaif",54.21);
		displayStudentdetails(s);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
	}
		static void displayStudentdetails(ArrayList<Student> al)
		{
			
			Iterator<Student> it = al.iterator();
			while(it.hasNext())
			{
				Student s =  it.next();
				System.out.println("Id is" +s.id);
				System.out.println("Name is" +s.name);
				System.out.println("Percentage is" +s.percentage);
				System.out.println("==============================");
			}
			
		}
		

		
		
		
	}

