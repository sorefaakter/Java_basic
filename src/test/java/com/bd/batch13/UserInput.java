package com.bd.batch13;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//ClassName object-Name = new ClassName();
		Scanner myScanner = new Scanner(System.in);
		
//		System.out.print("Enter your name: ");
//		String name= myScanner.nextLine();
//		System.out.println(name);
		
		System.out.print("Enter 1st Number: ");
		int num= myScanner.nextInt();
		float num1 = myScanner.nextFloat();
		System.out.println(num1);
	}

}
