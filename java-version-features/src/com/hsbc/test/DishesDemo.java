package com.hsbc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.hsbc.model.beans.Dish;

public class DishesDemo {

	public static void main(String[] args) {
		List<Dish> dishesList = Dish.getAllDishes();
		// old approach to iterate
		for(Dish d : dishesList) {
			System.out.println(d);
		}
		// new approach is to use forEach method of List
		System.out.println("----------------------------------------------");
		dishesList.forEach(item -> System.out.println(item));
		
		// old apprach way of sorting
		System.out.println("---- Old apprach way of sorting and displaying -----");
		Collections.sort(dishesList, (d1, d2) -> d1.getName().compareTo(d2.getName()));
		for(Dish d : dishesList) {
			System.out.println(d);
		}
		
		System.out.println("---- New way of sorting & displaying but without modifying the original datastructure");
		// in the above statement the original data-structure is completely modified
		dishesList.stream().sorted((d1, d2) -> Double.compare(d1.getPrice(), d2.getPrice()))
			.forEach(item -> System.out.println(item));
		
		List<Dish> sortedDishByCalroie = dishesList.stream().sorted((d1, d2) -> d1.getCalorie() - d2.getCalorie())
				.collect(Collectors.toList());
		System.out.println("****** You have a sorted Dish in a list");
		sortedDishByCalroie.forEach(item -> System.out.println(item));
		System.out.println("----------Getting the top 3 items sorted by name------------");
		dishesList.stream()
			.sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
			.limit(3).forEach(item -> System.out.println(item));
	}

}
