package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
	Scanner sc = new Scanner(System.in);
	public static int menu(){
		int choice ;
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("8. EXIT ");
		choice = sc.nextInt();
		System.out.println("-------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
	
		List<Book> list = new ArrayList<Book>();
//		list.add(new Book("10",560.50,"Chetan",100));
		int choice = 0;
	    while(choice != menu()) {
	    	switch(choice) {
	    	case 1:
	    		
	    		
	    		
	    	}
	    	
	    }

	}

}
