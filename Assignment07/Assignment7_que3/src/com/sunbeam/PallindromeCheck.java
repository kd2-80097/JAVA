package com.sunbeam;

import java.util.Scanner;

public class PallindromeCheck {

	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        StringBuilder reversed = new StringBuilder(input).reverse();
	        String rev=reversed.toString();
	        if(input.equals(rev)) {
	        	System.out.println("String is pallindrome");
	        	
	        }else
	        System.out.println("String is not pallindrome");

	}

}
