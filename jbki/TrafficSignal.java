package com.jbki;

public class TrafficSignal {
	public static void main(String[] args) {
		String color = "yellow";

		switch (color) {
		case "red":
			System.out.println(" Stop...!");
			break;
		case "yellow":
			System.out.println(" Ready to Go...!");
			break;
		case "green":
			System.out.println(" Go....!");
			break;
		default:
			System.out.println(" Invalid Input...!");
		}
	}

}
