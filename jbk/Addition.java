package com.jbk;

public class Addition {

//	 Parameterized with return type

	public String add1(int a, int b) {

		int c = a + b;
		return (" Addition is = " + c);

	}

//	 Parameterized without return type

	public void add2(int a, int b) {

		int c = a + b;
		System.out.println(" Addition is = " + c);

	}

//	Non-Parameterized with return type

	public String add3() {
		int a = 5;
		int b = 4;
		int c = a + b;
		return (" Addition is = " + c);

	}
//		Non-Parameterized with return type

	public void add4() {
		int a = 10;
		int b = 4;
		int c = a + b;
		System.out.println(" Addition is = " + c);

	}

}
