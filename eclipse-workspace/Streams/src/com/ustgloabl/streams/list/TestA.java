package com.ustgloabl.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA
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
		al.stream().filter(i -> i%2 == 0 ).collect(Collectors.toList());
		System.out.println("Even numbers are:");
		
		for(Integer i : l)
		{
		
			System.out.println(i);
		}
		
	}
}
