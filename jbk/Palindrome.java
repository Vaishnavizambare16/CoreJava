package com.jbk;

public class Palindrome {
	
//  Non Parameterized without return type
	
	public void m1() {
		int num = 121;
		int original = num;
		int reverse = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if( original == reverse) {
			System.out.println( original + " Number is Palindrome No " );
		}else {
			System.out.println( original + " Number is Palindrome No " );
		}
	}
		
//   Non Parameterized with return type
		
		
	public String m2() {
		int num = 151;
		int original = num;
		int reverse = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if( original == reverse) {
			return( original + " Number is Palindrome No " );
		}else {
			return( original + " Number is Not Palindrome No " );
		}
		
	}

		
//       Parameterized with return type
		
		
		public String m3(int num) {

			int original = num;
			int reverse = 0;
			
			while(num != 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			if( original == reverse) {
				return( original + " Number is Palindrome No " );
			}else {
				return( original + " Number is Not Palindrome No " );
			}
			
		}

		
//      Parameterized without return type
		
		public void m4(int num) {

			int original = num;
			int reverse = 0;
			
			while(num != 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			if( original == reverse) {
				System.out.println( original + " Number is Palindrome No " );
			}else {
				System.out.println( original + " Number is Not Palindrome No " );
			}
			
		}
}
