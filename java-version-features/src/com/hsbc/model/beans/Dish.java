package com.hsbc.model.beans;

import java.util.ArrayList;
import java.util.List;

public class Dish {
	private String name;
	private double price;
	private int calorie;
	
	public Dish(String name, double price, int calorie) {
		super();
		this.name = name;
		this.price = price;
		this.calorie = calorie;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", calorie=" + calorie + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public static List<Dish> getAllDishes() {
		List<Dish> dishes = new ArrayList<Dish>();
		dishes.add(new Dish("Pulao", 120, 100));
		dishes.add(new Dish("Panner Fried Rice", 140, 180));
		dishes.add(new Dish("Veg Fried Rice", 140, 120));
		dishes.add(new Dish("Chicken Tandoori", 300, 220));
		dishes.add(new Dish("Grill Chiken", 320, 240));
		dishes.add(new Dish("Fish", 340, 150));
		dishes.add(new Dish("Veg Manchoorian", 150, 80));
		dishes.add(new Dish("Gobi Manchoorian", 100, 70));
		dishes.add(new Dish("Masala Dosa", 90, 70));
		dishes.add(new Dish("Jeera Rice", 100, 80));
		return dishes;
	}
}
