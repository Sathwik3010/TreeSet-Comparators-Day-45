package com.codegnan.collections;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		Set<Employee> TreeSet = new TreeSet<>(new EmployeeComparator());
		TreeSet.add(new Employee(1,"Dev", 30000, "hyd"));
		TreeSet.add(new Employee(2,"Sathwik", 7000, "blr"));
		TreeSet.add(new Employee(3,"Ruthwik", 4000, "chn"));
		TreeSet.add(new Employee(4,"Por", 50000, "dl"));
		
		System.out.println(TreeSet);
		for(Employee emp : TreeSet) {
			System.out.println(emp);
		}
	}

}
