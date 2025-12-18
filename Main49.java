package com.codegnan.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Stud{
	int id;
	String name;
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
public class Main49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Stud> set1 = new HashSet<>();
		HashSet<Stud> set2 = new HashSet<>();

		int n1 = sc.nextInt();
		for(int i=0; i<n1; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			set1.add(new Stud(id, name));
		}
		
		int n2 = sc.nextInt();
		for(int i=0; i<n2; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			set2.add(new Stud(id, name));
		}
		
		if(set1.equals(set2)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
