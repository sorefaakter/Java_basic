package com.bd.batch13;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList<Data-Type> arrayName = new ArrayList<DataType>();
		ArrayList<String> customers = new ArrayList<String>();
		customers.add("Matin");
		customers.add("James");
		
		System.out.println(customers);
//		System.out.println("Size: "+customers.size());
//		System.out.println(customers.get(0));
//		customers.remove(0);
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i) == "James") {
				System.out.println(customers.get(i));
			}
		}
//		customers.clear();
//		System.out.println("Size: "+customers.size());
		
		//For Each
//		for(String name : customers) {
//			System.out.println(name);
//		}
		
	}

}
