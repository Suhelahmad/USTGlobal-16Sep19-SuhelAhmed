package com.ustglobal.immutable;

public class Test 
{
	public static void main(String[] args) 
	{
		Mystring ms = new Mystring(12,"Ammu");
		
		System.out.println(ms.getRollno());
		System.out.println(ms.getname());
		System.out.println(ms);
		
		Mystring ms1 = ms.changeContent(30, "SUhel");
		System.out.println(ms1.getRollno());
		System.out.println(ms1.getname());
	}
}
