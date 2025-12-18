package com.codegnan.collections;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employeess{
	String name;
	int salary;
	
	public Employeess(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeess other = (Employeess) obj;
		return Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public String toString() {
		return "Employeess [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class Main47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		TreeSet<Employeess> set = new TreeSet<>(new EmployeessComparator());
		
		for(int i=0; i<n; i++) {
			String name = sc.next();
			int salary = sc.nextInt();
			set.add(new Employeess(name, salary));
		}
		
		int count = 0;
		for(Employeess e : set) {
			if(count > 0)
				System.out.print(" ");
			System.out.print(e.name);
			count++;
		}
		sc.close();
	}
}
