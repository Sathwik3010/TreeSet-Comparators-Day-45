package com.codegnan.collections;

import java.util.Comparator;

public class EmployeessComparator implements Comparator<Employeess>{

	@Override
	public int compare(Employeess e1, Employeess e2) {

		if(e1.salary != e2.salary) {
			return e1.salary - e2.salary;
		}
		return e1.name.compareTo(e2.name);
	}

}
