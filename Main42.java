package com.codegnan.collections;

import java.util.Scanner;
import java.util.TreeSet;

class Book implements Comparable<Book>{

	String title;
	int price;
	
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}


	@Override
	public int compareTo(Book b) {
		return this.title.compareTo(b.title);
	}
	
}
public class Main42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		TreeSet<Book> set = new TreeSet<>();
		for(int i=0;i<n; i++) {
			String title = sc.next();
			int price = sc.nextInt();
			set.add(new Book(title, price));
		}
		
		for(Book b: set) {
			System.out.print(b.title+" ");
		}
		sc.close();
	}

}
