package com.jbki;

public class ATMOption {
	public static void main(String[] args) {
		int atmOption = 2;
		switch (atmOption) {
		case 1:
			System.out.println(" Check Balance..");
			break;
		case 2:
			System.out.println(" Deposit..");
			break;
		case 3:
			System.out.println(" Withdraw..");
			break;

		default:
			System.out.println(" Exit...!");
		}
	}

}
