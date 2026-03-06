package com.tka;

public class Withdrawal {
	public static void main(String[] args) {
		int balance = 20000;
		int withdrawalAmount = 40000;

		if (balance >= 20000 && withdrawalAmount >= 40000) {
			System.out.println(" Withdrawal Successfull...");
		} else {
			System.out.println(" Insufficient Balance...");
		}
	}

}
