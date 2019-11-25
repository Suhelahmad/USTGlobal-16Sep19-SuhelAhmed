package com.ustgloabl.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class help 
{
	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.perc);
			System.out.println("==========================");
		}
	
	}
	
	void displayFailedStudents(ArrayList<Student> al)
	{
		List<Student> al2 = al.stream().filter(student -> student.perc < 40  ).collect(Collectors.toList());
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println("name is" +s.name);
			System.out.println("Id is " +s.id);
			System.out.println("Percentage is " +s.perc);
		}
	}
	
	void displaypassedStudents(ArrayList<Student> al)
	{
		List<Student> al3 = al.stream().filter(student -> student.perc > 40  ).collect(Collectors.toList());
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println("name is" +s.name);
			System.out.println("Id is " +s.id);
			System.out.println("Percentage is " +s.perc);
		}
	}
	
	void displaytopperStudents(ArrayList<Student> al)
	{
		Comparator<Student> cmp = (e1,e2)->
		{
			if(e1.perc>e2.perc)
			{
				return 1;
			}
			else if(e1.perc < e2.perc)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
	}
	
}
