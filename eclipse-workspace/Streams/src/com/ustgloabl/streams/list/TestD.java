package com.ustgloabl.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(65);
		al.add(12);
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(10);
		
		List<Integer> l =
				al.stream().map(i -> i+54 ).collect(Collectors.toList());
				System.out.println("54 is Added:");
				
				for(Integer i : l)
				{
				
					System.out.println(i);
				}
	}
}
