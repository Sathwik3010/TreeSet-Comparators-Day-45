package com.codegnan.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class CustomInteger{
	int value;

	public CustomInteger(int value) {
		super();
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomInteger other = (CustomInteger) obj;
		return value == other.value;
	}
	
	
}
public class Main40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashSet<CustomInteger> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(new CustomInteger(i));
		}
		
		System.out.println(set.size());
		sc.close();
	}

}
