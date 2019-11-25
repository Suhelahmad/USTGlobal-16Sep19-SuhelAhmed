package com.ustglobal.sorting.set;

import java.util.Comparator;

public class sortbyname implements Comparator<Bank> 
{
	@Override
	public int compare(Bank ol, Bank ok)
	{
		return ol.name.compareTo(ok.name);
	}
}
