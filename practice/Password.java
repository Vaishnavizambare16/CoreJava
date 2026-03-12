package com.practice;

public class Password {
	public static void main(String[] args) {
		int pass = 3;
		switch (pass) {
		case 1:
			System.out.println(" Weak Password...!");
			break;
		case 2:
			System.out.println(" Medium Password...!");
			break;
		case 3:
			System.out.println(" Strong Password...!");
			break;
		default:
			System.out.println(" Invalid Passwors...!");
		}
	}

}
