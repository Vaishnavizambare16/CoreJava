package com.tka;

public class ReverseNo {

	    private int number; 

	    
	    public void setNumber(int number) {
	        this.number = number;
	    }

	   
	    public int getNumber() {
	        return this.number;
	    }

	   
	    public int getReversedNumber() {
	        int num = getNumber(); 
	        int reversed = 0;
	        
	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num = num / 10;
	        }
	        return reversed;
	    }
	}
	    
	   
	