package com.sunbeam;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        // Declare two arrays of custom class type
	        MyString[] array1 = new MyString[4];
	        MyString[] array2 = new MyString[4];

	        System.out.println("Enter five strings for array1:");
	        for (int i = 0; i < 4; i++) {
	            array1[i] = new MyString(scanner.nextLine());
	        }

	        System.out.println("Enter five strings for array2:");
	        for (int i = 0; i < 4; i++) {
	            array2[i] = new MyString(scanner.nextLine());
	        }

	        
	        MyString arr[]=new MyString[5];
	        int cnt=0;
	        for (int i=0;i<4;i++)
	        {
	        	for (int j=0;j<4;j++) {
	        		if(array1[i].equals(array2[j]))
	        		{
	        			arr[cnt++]=new MyString(array1[i].getValue());
	        		}
	        	}
	        	
	        }
	        
	        // Print the duplicate values
	        System.out.println("Duplicate values:");
	        for (MyString item : arr) {
	            if (item != null) {
	                System.out.println(item.getValue());
	            }
	        }  
	      
	}

}
