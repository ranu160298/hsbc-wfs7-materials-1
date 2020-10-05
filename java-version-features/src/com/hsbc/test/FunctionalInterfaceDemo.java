package com.hsbc.test;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		callOperation((a, b) -> a * b);
		callOperation((a, b) -> a + b);
	}
	public static void callOperation(Calculator calculator) {
		int result = calculator.operation(40, 30);
		System.out.println(result);
	}

}
