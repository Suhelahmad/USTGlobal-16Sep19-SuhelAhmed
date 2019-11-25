package com.ustglobal.sorting.set;

import java.util.Comparator;

public class sortbypincode implements Comparator<Bank> 
{
	
		@Override
		public int compare(Bank o, Bank z)
		{
			Integer i = o.pincode;
			Integer m = z.pincode;
			return m;
		}
}