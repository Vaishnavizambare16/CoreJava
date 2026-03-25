package com.jbk;

public class Factorial {
//	Parameterized with return type

	public String fact1(int fact) {

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
		return (fact + " Factorial No ");

	}
//	Parameterized without return type

//	public void fact2(int fact) {
//
//		for (int i = 1; i <= 5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//
//	}

//   Non-Parameterized with return type

//	public String fact3() {
//
//		int fact = 1;
//		for (int i = 1; i <= 5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//		return (fact + " Factorial No ");
//	}

//   Non-Parameterized without return type
	
//	public void fact4() {
//
//		int fact = 1;
//		for (int i = 1; i <= 5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//
//	}
	
	
}
