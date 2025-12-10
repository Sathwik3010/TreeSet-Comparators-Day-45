package com.codegnan.collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
//		return e1.compareTo(e2);
//		return Integer.compare(e1.getEid(), e2.getEid());
		return -e1.getEname().compareTo(e2.getEname());
	}
	

}
