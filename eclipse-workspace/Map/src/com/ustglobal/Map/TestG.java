package com.ustglobal.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG 
{
	public static void main(String[] args)
	{
		Employee s1 = new Employee(1,"Suhel", 25000);
		Employee s2 = new Employee(2,"Fayum", 30000);
		Employee s3 = new Employee(3,"Kayum", 45000);
		Employee s4 = new Employee(4,"Saif",  50000);
		Employee s5 = new Employee(5,"Kaif",  5000);
		Employee s6 = new Employee(6,"Wahid", 10000);
		Employee s7 = new Employee(7,"Aijaz", 15000);
		Employee s8 = new Employee(7,"mush",  5000);
		Employee s9 = new Employee(7,"Ammu", 15000);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Employee> al3 = new ArrayList<Employee>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("First", al1);
		hm.put("Second", al2);
		hm.put("Third", al3);
		
		ArrayList<Employee> first = hm.get("Third");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext())
		{
			Employee s = it.next();
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Salary is " +s.salary);
			System.out.println("================================");
		}
	}
}
