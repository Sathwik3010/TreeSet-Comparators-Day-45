package com.codegnan.collections;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		t.add(20);

		System.out.println(t);
	}

}
