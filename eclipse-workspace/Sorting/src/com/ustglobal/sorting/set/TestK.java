package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK
{
	public static void main(String[] args)
	{
		Comparator<employeee> comp = (e1,e2) -> 
		{
			if(e1.height > e2.height)
			{
				return 1;
			}else if(e1.height < e2.height)
			{
				return -1;
			}
			else
			{
				return 0; // sort by height
			}
		};
		
		TreeSet<employeee> ts = new TreeSet<employeee>(comp);
		
		employeee p1 = new employeee(2,"suhel",5.6);
		employeee p2 = new employeee(3,"kayum",6.6);
		employeee p3 = new employeee(4,"fayum",4.6);
		employeee p4 = new employeee(5,"saif",6.5);
		employeee p5 = new employeee(6,"kaif",7.0);
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		
		System.out.println("=======Using Iterator=====");
		Iterator<employeee> it = ts.iterator();
		while(it.hasNext())
		{
		employeee lp = it.next();
		System.out.println("Id is" +lp.id);
		System.out.println("Name is " +lp.name);
		System.out.println(" Height is" +lp.height);
		
		
		
		
		}
	  }
	}

		
	
		



