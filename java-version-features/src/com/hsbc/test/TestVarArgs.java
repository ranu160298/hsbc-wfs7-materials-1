package com.hsbc.test;

public class TestVarArgs {

	public static void main(String[] args) {
		int r = sum();
		System.out.println("r = "+r);
		r = sum(1);
		System.out.println("r = "+r);
		r = sum(2, 3, 4);
		System.out.println("r = "+r);
		r = sum(4, 5, 6, 7);
		System.out.println("r = "+r);
	}

	public static int sum(int... x) {
		int result = 0;
		System.out.println("sum()");
		for(int y : x) {
			result = result + y;
		}
		return result;
	}
}
