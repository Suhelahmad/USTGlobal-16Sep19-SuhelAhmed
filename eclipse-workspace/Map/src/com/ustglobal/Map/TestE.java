package com.ustglobal.Map;

import java.util.Map;
import java.util.TreeMap;

public class TestE
{
	public static void main(String[] args) 
	{
		TreeMap<String , Integer> lh = new TreeMap<String , Integer>();
		lh.put("Bengaluru", 560076);
		lh.put("Belagavi", 591165);
		lh.put("Kittur", 564200); // based on keys it sort the values
		//lh.put(null, 554454); // Not allowed null
		
		for(Map.Entry<String, Integer> m : lh.entrySet())
		{
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Based On key Values it will sort");
			System.out.println("Key is " +key+"-------" + "Value " +value);
			System.out.println("=====================");
		}
}
	}
