package com.jbka;

public class SumOfEvenNo {
	public static void main(String[] args) {
//		for loop

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}

//		while loop 
//		
//		int sum = 0;
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				sum += i;
//				System.out.println(sum);
//			}
//			i++;
//		}

//		do while loop
//		
//		int sum = 0;
//		int i = 1;
//		do {
//			if (i % 2 == 0) {
//				sum += i;
//				System.out.println(sum);
//			}
//			i++;
//		} while (i <= 100);
	}

}
