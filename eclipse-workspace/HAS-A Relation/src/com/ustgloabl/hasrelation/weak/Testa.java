package com.ustgloabl.hasrelation.weak;

public class Testa 
{
	public static void main(String[] args) 
	{
		Music p = new Music();
		System.out.println(p.name);
		p.Music();
		p.Gear();
		System.out.println("===================");
		p.m.write();  // Has=A relation
	}
}
