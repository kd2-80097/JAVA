package assign1_3;

/* 3. Display food menu to user. User will select items from menu along with the quantity. 
 * (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) 
 * Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit. */

import java.util.Scanner;

class Food
{
 private int dosa = 60;
 private int idli = 40;
 private int samosa = 30;
 private int vadapav = 20;
 private int misalpav = 80;
 private int pavbhaji = 70;
 private int quantity;
 
 public Food()
 {} 
 public int getDosa() {
	return dosa;
}
public int getIdli() {
	return idli;
}
public int getSamosa() {
	return samosa;
}
public int getVadapav() {
	return vadapav;
}
public int getMisalpav() {
	return misalpav;
}
public int getPavbhaji() {
	return pavbhaji;
}
public int getQuantity() {
	return quantity;
}

public int menu()
 {
	 Scanner s = new Scanner(System.in);
	 int choice;
	 System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
	 System.out.println("0. Exit");
	 System.out.println("1. Dosa");
	 System.out.println("2. Idli");
	 System.out.println("3. Samosa");
	 System.out.println("4. Vadapav");
	 System.out.println("5. Misalpav");
	 System.out.println("6. Pavbhaji");
	 System.out.println("7. Generate the Bill");
	 System.out.println("Please enter your choice");
	 choice = s.nextInt();
	 System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
	 return choice;

 }
 
 
 
}
public class Que_3 {
	
	
	public static void main(String[] args) {

		Food f = new Food();
		Scanner sc = new Scanner(System.in);
		int choice;
		int quantity;
		int totalBill=0;
		while((choice = f.menu()) != 0)
		{
			switch (choice)
			{
			case 1:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = (f.getDosa()*quantity);
				break;
				
			case 2:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = totalBill +(f.getIdli()*quantity);
				break;
				
			case 3:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = totalBill + (f.getSamosa()*quantity);
				break;
				
			case 4:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = totalBill + (f.getVadapav()*quantity);
				break;
				
			case 5:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = totalBill + (f.getMisalpav()*quantity);
				break;
				
			case 6:
				System.out.println("Please enter the Quantity = ");
				quantity = sc.nextInt();
				totalBill = totalBill + (f.getPavbhaji()*quantity);
				break;
				
			case 7:
				System.out.println("Total Bill = "+totalBill);
				break;
				
			default :
				System.out.println("Entered the wrong choice");
				System.out.println("Please Enter The Correct Choioce");
			}
		}
		System.out.println("Thank you for Dining at Our Place");
		
	}

}
