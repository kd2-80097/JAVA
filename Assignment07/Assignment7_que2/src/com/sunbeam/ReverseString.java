package com.sunbeam;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a StringBuilder 
        StringBuilder reversed = new StringBuilder(input).reverse();
        
        // Convert the StringBuilder back to a String
        String result = reversed.toString();

        System.out.println("Reversed string: " + result);
	}

}
