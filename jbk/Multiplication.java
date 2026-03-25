package com.jbk;

public class Multiplication {
//	 Parameterized with return type

	public String m1(int a, int b) {

		int c = a * b;
		return (" Multiplication is = " + c);

	}

//	 Parameterized without return type

	public void m2(int a, int b) {

		int c = a * b;
		System.out.println(" Multiplication is = " + c);

	}

//	Non-Parameterized with return type

	public String m3() {
		int a = 5;
		int b = 8;
		int c = a * b;
		return (" Multiplication is = " + c);

	}
//		Non-Parameterized with return type

	public void m4() {
		int a = 7;
		int b = 4;
		int c = a * b;
		System.out.println(" Multiplication is = " + c);

	}


}
