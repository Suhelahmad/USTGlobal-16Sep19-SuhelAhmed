package com.ustglobal.immutable;

public final class Mystring
{
	private final int rollno;
	private final String name;
	
	public Mystring(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public String getname()
	{
		return name;
	}
	
	public Mystring changeContent(int rollno, String name)
	{
		Mystring m = new Mystring(rollno, name);
		return m;
	}
	
}
