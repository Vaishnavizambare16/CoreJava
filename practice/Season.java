package com.practice;

public class Season {
	public static void main(String[] args) {
		String month = "May";
		switch (month) {
		case "Dec", "Jan", "Feb":
			System.out.println("Winter...!");
			break;
		case "March", "April", "May":
			System.out.println("Summer...!");
			break;
		case "June", "July", "August":
			System.out.println(" Monsoon...!");
			break;
		case "Sep", "Oct", "Nov":
			System.out.println("Autumn...!");
			break;
		default:
			System.out.println(" Invalid Input...!");
		}
	}

}
