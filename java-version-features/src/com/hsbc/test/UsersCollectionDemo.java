package com.hsbc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hsbc.model.beans.Users;


public class UsersCollectionDemo {

	public static void main(String[] args) {
		List<Users> usersList = new ArrayList<>();
		usersList.add(new Users(88, "David", 44));
		usersList.add(new Users(77, "Alexandar", 64));
		usersList.add(new Users(99, "Edward", 54));
		usersList.add(new Users(55, "Charles", 34));
		usersList.add(new Users(66, "Bruce", 24));
		
		// sorting based on name		
		Collections.sort(usersList, new Comparator<Users>() {

			@Override
			public int compare(Users o1, Users o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
			
		});
		
		for(Users user : usersList) {
			System.out.println(user);
		}
		System.out.println("---------------------");
		// sorting based on id with Lambda expression
		Collections.sort(usersList, (u1, u2) -> u1.getUserId() - u2.getUserId());
		for(Users user : usersList) {
			System.out.println(user);
		}
	}

}
