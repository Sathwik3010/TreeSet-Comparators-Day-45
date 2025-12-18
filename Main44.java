package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

class Products{
	String name;
	int price;
	public Products(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
		
}
public class Main44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		LinkedHashSet<Products> set = new LinkedHashSet();

		for(int i=0;i<n; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			set.add(new Products(name, price));
		}
		
		Iterator<Products> it = set.iterator();
		while(it.hasNext()) {
			Products p = it.next();
			System.out.print(p.name);
			if(it.hasNext())
				System.out.print(" ");
		}
		sc.close();
	}

}
