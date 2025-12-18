package com.codegnan.collections;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

class Students{
	int id;
	String name;
	
	Students(int id, String name){
		this.id = id;
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Students other = (Students) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
	
}
public class Main41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedHashSet<Students> set = new LinkedHashSet<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			set.add(new Students(id, name));
		}
		
		for(Students s : set) {
			System.out.print(s.name+" ");
		}
		sc.close();
	}

}
