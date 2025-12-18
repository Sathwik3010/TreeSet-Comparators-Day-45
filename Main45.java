package com.codegnan.collections;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

class Books{
	int id;
	String title;
	public Books(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return id == other.id && Objects.equals(title, other.title);
	}
	
}
public class Main45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Books> mergedSet = new LinkedHashSet<>();
		
		int s1 = sc.nextInt();
		for(int i=0;i<s1; i++) {
			int id = sc.nextInt();
			String title = sc.next();
			
			mergedSet.add(new Books(id, title));
		}
		
		int s2 = sc.nextInt();
		for(int i=0;i<s2;i++) {
			int id = sc.nextInt();
			String title = sc.next();
			
			mergedSet.add(new Books(id, title));
		}
		
		System.out.print("[");
		int count = 0;
		for(Books b: mergedSet) {
			if(count > 0)
				System.out.print(", ");
			System.out.print("("+b.id+", \""+b.title+"\")");
			count++;
		}
		System.out.println("]");
		sc.close();
	}

}
