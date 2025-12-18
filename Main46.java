package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

class Car {
	String model;
	int year;
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && year == other.year;
	}
	
	
}
public class Main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedHashSet<Car> set = new LinkedHashSet<>();
		
		for(int i=0; i<n; i++) {
			String model = sc.next();
			int year = sc.nextInt();
			set.add(new Car(model, year));
		}
		
		Iterator<Car> it = set.iterator();
		while(it.hasNext()) {
			Car c = it.next();
			System.out.print(c.model);
			if(it.hasNext())
				System.out.print(" ");
		}
		sc.close();
	}

}
