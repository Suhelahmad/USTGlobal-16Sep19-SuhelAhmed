package com.ustglobal.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestC 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String , Integer> lh = new LinkedHashMap<String , Integer>();
		lh.put("Bnegaluru", 560076);
		lh.put("Belagavi", 591165);
		lh.put("Kittur", 564200);
		
		for(Entry<String, Integer> m : lh.entrySet())
		{
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is " +key+"-------" + "Value " +value);
		}
		
		System.out.println(lh);
		Set<String> s = lh.keySet();
		for(String s1:s)
		{
			System.out.println("Key = " +s1);
		}
		
		System.out.println("To get values");
		Collection<Integer> c = lh.values();
		
		for(Integer o :c)
		{
			System.out.println("values = " +o);
		}
		
	}
}
