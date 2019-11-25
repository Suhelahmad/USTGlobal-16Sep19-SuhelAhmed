package com.ustglobal.typecasting.reference;

public class Test 
{
	public static void main(String[] args)
	{
		pen p = new marker();   // upcasting
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size); // not possible
//		p.color();
		
		marker m = (marker) p; //downcasting
		System.out.println(m.size);
		m.color();
		m.write();
	} 
}
