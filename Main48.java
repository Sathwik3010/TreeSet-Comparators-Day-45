package com.codegnan.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Studentss{
	int id;
	String name;
	
	
	public Studentss(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentss other = (Studentss) obj;
		return Objects.equals(name, other.name);
	}

		
}
public class Main48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Studentss> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			set.add(new Studentss(id, name));
		}
		
		System.out.println(set.size());
		sc.close();
	}

}
