package com.jbki;

public class MobileSetting {
	public static void main(String[] args) {
		int menu = 3;
		switch (menu) {
		case 1:
			System.out.println(" Wifi..");
			break;
		case 2:
			System.out.println(" Bluetooth..");
			break;
		case 3:
			System.out.println(" Mobile Data..");
			break;
		case 4:
			System.out.println(" Airplane Mode..");
			break;
		default:
			System.out.println(" Invalid Choice...!");
		}
	}

}
