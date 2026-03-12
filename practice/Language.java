package com.practice;

public class Language {
	public static void main(String[] args) {
		String lang = "Marathi";
		switch (lang) {
		case "English":
			System.out.println(" Hello...!");
			break;
		case "Hindi":
			System.out.println(" Namste...!");
			break;
		case "Marathi":
			System.out.println(" Namskar...!");
			break;
		default:
			System.out.println(" Invalid Input...!");
		}
	}

}
