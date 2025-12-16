package com.array;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234, reverseNubmer = 0;
		while(num!=0) {
			int lastNumber = num % 10;
			reverseNubmer  = reverseNubmer * 10 + lastNumber;
			//for removing the last digit
			num/=10;
		}
		System.out.println("Reverse Number::"+ reverseNubmer);

	}

}
