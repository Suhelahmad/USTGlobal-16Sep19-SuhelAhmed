package com.ustglobal.sorting.list;

import java.util.Comparator;

public class sortbyprice implements Comparator<marker>
{
	@Override
	public int compare(marker m1, marker m2)
	{	
			if(m1.price>m2.price)
			{
				return 1;
			}
			else if(m1.price<m2.price)
			{
				return -1;
			}else {
			return 0;
		}
		
	}
}
