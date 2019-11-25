package com.ustglobal.sorting.list;

public class Laptop 
{
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	
	public int compareTo(Laptop s)
	{	
		if(this.price>s.price)
		{
			return 1;
		}
		else if(this.price<s.price)
		{
			return -1;
		}else 
		{
		return 0;
	}
}
	
}
