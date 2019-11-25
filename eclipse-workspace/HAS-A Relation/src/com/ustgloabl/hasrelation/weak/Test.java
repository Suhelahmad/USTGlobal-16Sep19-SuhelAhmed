package com.ustgloabl.hasrelation.weak;

public class Test 
{
	public static void main(String[] args) 
	{
		person p = new person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("===================");
		p.m.write();  // Has=A relation
	}
}
