package com.ustglobal.google;

public class Test
{
	public static void main(String[] args) 
	{
		Browser b = new Browser();
		
		Google g = new Gmail();
		b.open(g);
		
		Google gd = new Googledrive();
		b.open(gd);

	}
}
