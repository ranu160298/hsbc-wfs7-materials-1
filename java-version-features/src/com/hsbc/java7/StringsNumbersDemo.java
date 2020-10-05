package com.hsbc.java7;

public class StringsNumbersDemo {

	public static void main(String[] args) {
		double amount = 50_999;
		System.out.println("Amount: "+amount);
		
		String option = "withdraw";
		switch(option) {
		case "deposit":
			System.out.println("Deposit done");
			break;
		case "withdraw":
			System.out.println("Withdraw done");
			break;
			default : 
				System.out.println("Default Case!");
		}
	}

}
