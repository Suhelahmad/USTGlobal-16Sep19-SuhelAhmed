package com.ustglobal.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF 
{
	public static void main(String[] args) 
	{
		
	Student s1 = new Student(2,"Divya", 67.21);
	Student s2 = new Student(3,"Suhel", 25.32);
	Student s3 = new Student(4,"kayum", 35.32);
	Student s4 = new Student(5,"fayum", 46.32);
	Student s5 = new Student(6,"AMmu", 49.32);
	Student s6 = new Student(7,"Suraja", 25.32);
	Student s7 = new Student(7,"Suraja", 25.32);
	Student s8 = new Student(7,"Suraja", 25.32);
	Student s9 = new Student(7,"Suraja", 25.32);
	
	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s4);
	al2.add(s5);
	al2.add(s6);
	
	ArrayList<Student> al3 = new ArrayList<Student>();
	al3.add(s7);
	al3.add(s8);
	al3.add(s9);
	
	HashMap<String, ArrayList<Student>> hm = new HashMap<>();
	hm.put("First", al1);
	hm.put("Second", al2);
	hm.put("Third", al3);
	
	ArrayList<Student> first = hm.get("Second");
	
	Iterator<Student> it = first.iterator();
	while(it.hasNext())
	{
		Student s = it.next();
		System.out.println("Id is " +s.id);
		System.out.println("Name is " +s.name);
		System.out.println("Percentage is " +s.percentage);
		System.out.println("================================");
	}
	
	
	
	
	
	
	
	
	
	}
}