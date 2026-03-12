package com.practice;

public class Fruit {
	public static void main(String[] args) {
		String fruit = "Apple";
		switch (fruit) {
		case "Apple":
			System.out.println(" Price of Apple is 100/- Rs");
			break;
		case "Mango":
			System.out.println(" Price of Mango is 80/- Rs");
			break;
		case "Orange":
			System.out.println(" Price of Orange is 40/- Rs");
			break;
		case "Banana":
			System.out.println(" Price of Banana is 60/- Rs");
			break;
		default:
			System.out.println(" Invalid Choice...!");
		}
	}

}
