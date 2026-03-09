package com.aa;

public class LargestNo {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		if(num1 >= num2 && num1>= num3) {
			System.out.println(num1 + " is largest ");
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is largest ");
		}else {
			System.out.println(num3 + " is largest ");
		}
	}

}
