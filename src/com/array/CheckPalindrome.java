package com.array;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1212, reverseNumber = 0, test =num;
		while(num!=0) {
			int lastNumber = num % 10;
				reverseNumber = reverseNumber * 10 + lastNumber;
				num/=10;
		}
		if(test == reverseNumber) {
			System.out.println(reverseNumber +" is Palindrome Number");
		}
		else {
			System.out.println(reverseNumber +" is not Palindrome Number");
		}

	}

}
