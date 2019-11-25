package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(85.2);
		al.add(97.32);
		al.add(55.10);
		al.add(25.22); //boolean add(object a) method
		al.add(25.22); // duplicate values can accept in arrayList
		al.add(null);
		
		System.out.println("ArrayList is =" +al);
		
		al.add(2,54.6);
		System.out.println("after adding 2nd index" +al);
		al.remove(0);
		System.out.println("after removing 0th index" +al);
		al.remove(null);
		System.out.println("after removing null" +al);
		Double val = al.get(4);
		System.out.println("Object at 4th index" +val);
		al.set(2, 77.6);
		System.out.println("after replacing 2nd index" +al);
		al.clear();
		System.out.println("after clear method" +al);
		al.contains(54.6);
		
		List<Double> al1 = new ArrayList<Double>();
		al1.add(12.3);
		al1.add(2.4);
		al1.add(45.2);
		
		al.addAll(al1);  //addAll method, add all with al with al1
		System.out.println("after addAll method" +al);
		
		boolean contain = al.containsAll(al1); // ContiansAll method 
		System.out.println("COntains all of al1 "  +contain);
		
		boolean res = al.removeAll(al1); // remove method 
		System.out.println("Removed all of al1 "  +res);
		
		
		
	}
}
