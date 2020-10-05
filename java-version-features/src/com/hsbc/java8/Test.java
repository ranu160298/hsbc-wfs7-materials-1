package com.hsbc.java8;

public interface Test {
	void demo1(); // abstract method
	default void demo2() {
		System.out.println("demo2() implemented in Test");
	}
	static void demo3() {
		System.out.println("demo3() static in Test");
	}
}
