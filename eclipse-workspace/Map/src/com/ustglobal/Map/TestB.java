package com.ustglobal.Map;

import java.util.HashMap;

public class TestB
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put("Suhel", 8748);
		hm.put("kayum", 9964);
		hm.put("fayum", 89042);
		
		HashMap hm1 = new HashMap();
		hm1.put("rahul", 8989);
		hm1.put("sameer", 45454);
		hm1.put("samiulla", 1111);
		
		boolean haskey = hm.containsKey("Suhel");
		System.out.println("Has key = " +haskey);
		System.out.println("========================");
		
		boolean hasvalue = hm.containsValue(45454);
		System.out.println("Has Value " +hasvalue);
		System.out.println("=====================");
		
		hm.putAll(hm1);
		
		System.out.println("After put all" +hm);
		System.out.println("==============================");
		
		System.out.println("Size of HasMap is = " +hm.size());
		System.out.println("=================================");
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty = " +isEmpty);
		
		System.out.println("====================");
//		hm.clear();
//		System.out.println("After Clear" +hm);
//		System.out.println(hm.isEmpty());
		
	}
}
