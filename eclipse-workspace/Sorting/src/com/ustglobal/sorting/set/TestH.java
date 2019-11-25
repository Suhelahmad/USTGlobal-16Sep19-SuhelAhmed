package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH
{
	public static void main(String[] args) {
		
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12,"Suhel",45000);
		Employee e2 = new Employee(13,"Suraja",40000);
		Employee e4 = new Employee(14,"Kayum",20000);
		Employee e5 = new Employee(15,"Fayum",15000);
		Employee e6 = new Employee(16,"Suhel",45000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		
		System.out.println("===========using Iterator===========");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext())
		{
			
			Employee e = it.next();
			System.out.println("Id is" +e.id);
			System.out.println("Name is" +e.name);
			System.out.println("salary is" +e.Salary);
		
	  }
		}
}
