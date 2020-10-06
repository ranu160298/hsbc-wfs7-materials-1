package com.hsbc.model;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
	private String brand;
	private double price;
	private int ramSize;
	
	public static List<Laptop> getAllLaptops() {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("Acer", 35000, 4));
		laptops.add(new Laptop("Lenova", 45000, 8));
		laptops.add(new Laptop("Acer", 55000, 8));
		laptops.add(new Laptop("HP", 30000, 4));
		laptops.add(new Laptop("Lenova", 58000, 16));
		laptops.add(new Laptop("Acer", 65000, 16));
		laptops.add(new Laptop("Dell", 23000, 4));
		laptops.add(new Laptop("Dell", 38000, 8));
		laptops.add(new Laptop("HP", 85000, 16));
		laptops.add(new Laptop("Acer", 40000, 8));
		return laptops;
	}
	
	public Laptop(String brand, double price, int ramSize) {
		super();
		this.brand = brand;
		this.price = price;
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ramSize=" + ramSize + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
}
