package com.codegnan.collections;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

class Employees{
	int id;
	String name;
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id;
	}
	
}
public class Main43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedHashSet<Employees> set = new LinkedHashSet<>();
		
		for(int i=0;i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			set.add(new Employees(id, name));
		}
		
		System.out.print("[");
		int count = 0;
		for(Employees e:set) {
			if(count>0)
				System.out.print(", ");
			System.out.print("("+e.id+", \""+e.name+"\")");
			count++;
		}
		System.out.println("]");

		sc.close();
	}

}
