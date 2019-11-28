package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank>{
	public int compare(Bank b1, Bank b2) {
		Long i = b1.micr;
		Long j = b2.micr;
		return i.compareTo(j);
		
	}

}
