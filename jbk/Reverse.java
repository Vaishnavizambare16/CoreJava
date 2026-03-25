package com.jbk;

public class Reverse {
	
//	Parameterized without return type
	
//	public void Rev1(int num) {
//		int reversed = 0;
//
//		while (num != 0) {
//			
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num /= 10;
//			
//		}
//		System.out.println(" Reversed No: " + reversed);
//	}
	
//	Parameterized with return type
	
//	public String Rev2(int num) {
//		int reversed = 0;
//
//		while (num != 0) {
//			
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num /= 10;
//			
//		}
//		return(" Reversed No: " + reversed);
//	}
	
//	Non-Parameterized with return type
	
//	public String Rev3() {
//		int num = 1234;
//		int reversed = 0;
//
//		while (num != 0) {
//			
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num /= 10;
//			
//		}
//		return(" Reversed No: " + reversed);
//	}
	
//	Non-Parameterized without return type
	public void Rev4() {
		int num = 1234;
		int reversed = 0;

		while (num != 0) {
			
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
			
		}
		System.out.println(" Reversed No: " + reversed);
	}


}
