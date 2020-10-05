package com.hsbc.java7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryResourceDemo {

	public static void main(String[] args) {
		String content = "Some Content for testing";
		try(FileWriter fileWriter = new FileWriter("abc.txt"); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) { 
			bufferedWriter.write(content);
		} catch(IOException e) {
			e.printStackTrace();
		} 
		System.out.println("File is written!");
	}

}
