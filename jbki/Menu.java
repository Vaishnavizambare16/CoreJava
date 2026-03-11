package com.jbki;

public class Menu {
	public static void main(String[] args) {
		int menu = 1;

		switch (menu) {
		case 1:
			System.out.println(" Login...!");
			break;

		case 2:
			System.out.println(" Register...!");
			break;
		case 3:
			System.out.println(" Profile...!");
			break;
		default:
			System.out.println(" Logout...!");

		}
	}

}
