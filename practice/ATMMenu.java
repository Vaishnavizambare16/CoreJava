package com.practice;

public class ATMMenu {
	public static void main(String[] args) {
		int atmOption = 1;
		switch (atmOption) {
		case 1:
			System.out.println(" Check Balance..");
			break;
		case 2:
			System.out.println(" Withdraw Money..");
			break;
		case 3:
			System.out.println(" Deposit Money..");
			break;

		default:
			System.out.println(" Exit...!");
		}
	}

}
