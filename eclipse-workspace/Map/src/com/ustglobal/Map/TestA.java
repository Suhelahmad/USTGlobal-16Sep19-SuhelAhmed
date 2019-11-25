package com.ustglobal.Map;

import java.util.HashMap;

public class TestA 
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("Suhel", 8748);
		hm.put("kayum", 9964);
		hm.put("fayum", 89042);
		hm.put("saif", 848);
		hm.put("kaif", 89620);
		hm.put(null, 5455);
		hm.put(null, 6545); // null and duplicate values are allowed
		
		System.out.println("Data is = " +hm);
		
		hm.put("Mala", 98985);
		System.out.println("AFter modify" +hm);
		hm.put("Ammu", 829624);
		System.out.println("After Adding Ammu" +hm);
		
		System.out.println("AFter Null" +hm);
		System.out.println("===========================");
		System.out.println("AFter Adding Duplicate Null" +hm);
		
		System.out.println("==================================");
		
		Object phoneno = hm.get("Suhel");
		System.out.println("Value " +phoneno);
		
		System.out.println("===========================");
		Object phoneno1 = hm.get("Su");
		System.out.println("Value " +phoneno1);
		
		System.out.println("=====================");
		Object value = hm.remove("kaif");
		System.out.println("Value " +value);
		System.out.println("After Remove----->" +hm);
	}
}
