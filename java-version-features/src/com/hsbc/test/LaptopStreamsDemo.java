package com.hsbc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hsbc.model.Laptop;

public class LaptopStreamsDemo {

	public static void main(String[] args) {
		List<Laptop> allLaptops = Laptop.getAllLaptops();
		// Get only the laptops  whose ram size is 4gb
		System.out.println("Size: "+allLaptops.size());
		System.out.println("--------- only the HP laptops -----");
//		for(Laptop laptop : allLaptops) {
//			if(laptop.getBrand().equals("Acer") && laptop.getRamSize() == 4) {
//				System.out.println(laptop);
//			}
//		}
		allLaptops.stream()
		.filter(item -> item.getBrand().equals("Acer"))
		.filter(item -> item.getRamSize() == 8)
		.forEach(item -> System.out.println(item));
		
		System.out.println("----- to store only name of the laptops -----");
		
//		List<String> names = new ArrayList<String>();
//		for(Laptop laptop : allLaptops) {
//			names.add(laptop.getBrand());
//		}
//		for(String name : names) {
//			System.out.println(name);
//		}
//		// map is used to transform stream of data of one type to another type, like laptop to string
		// distinct is used to get only distinct items
		List<String> names = allLaptops.stream().map(item -> item.getBrand()).distinct().collect(Collectors.toList());
		names.forEach(n -> System.out.println(n));
		// you can use count to count the number items in the stream
		long count = allLaptops.stream().filter(item -> item.getRamSize() >= 8).count();
		System.out.println("Count: "+count);
	}
}
