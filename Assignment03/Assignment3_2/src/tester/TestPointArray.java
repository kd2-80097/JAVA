package tester;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("*******************Menu*******************");
		System.out.println(" 1. Display Detials of Point \n 2. Display all the Points \n 3. Check if Two Points Are at Same Location \n 4. Exit");
		System.out.println("Please Enter Your Choice : ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,choice,index1,index2;
		System.out.println("Enter the no. of Points = ");
		size = sc.nextInt();
		
		Point2D [] point = new Point2D[size];
		for(int i=0;i<point.length;i++) {  //Allocating memory for each object in array
			point[i]= new Point2D();
		}
		
		for(int i=0;i<point.length;i++) {
			System.out.println("***********************");
			System.out.println("Enter the coordinates for Point "+i);
			point[i].acceptData();
		}
		
		while((choice = menu()) != 4) {
			switch(choice) {
			     
			case 1:
				System.out.println("Enter the index of point : ");
				index1 = sc.nextInt();
				System.out.println( point[index1].getDetails());
				break;
				
			case 2:
				for(Point2D pobj :point)
				{
					System.out.println(pobj.getDetails());
				}
				break;
				
			case 3:
				System.out.println("Enter the Index of first point  = ");
				index1 = sc.nextInt();
				System.out.println("enter the Index of second point = ");
				index2 = sc.nextInt();
				
				if(index1 >= 0 && index1 < point.length && index2>= 0 && index2 < point.length ) {
					if(index1 != index2) {
						if (point[index1].equals(point[index2])) {
							System.out.println("Both the point are at a same location");
						}
						else {
							double distance = Math.sqrt(Math.pow(point[index1].getX_coordinate()-point[index2].getY_coordinate(), 2.0) + Math.pow(point[index1].getY_coordinate()-point[index2].getY_coordinate(), 2.0));
							System.out.println("Distance between point at index "+index1+" and point at index "+index2+" is : "+distance);
						}
					}
					else {
						System.out.println("Both Indexes Are Same...You Have Selected Same Points");
					}
				}
				else {
					System.out.println("Invalid Index !!! Pleaase Enter The Valid Index ");
				}
				break;
				
			default :
				System.out.println("Entered the Wrong Choice....Please Enter The Valid Choice");
			}
		}
		System.out.println("Thank You For Using Our Application");
	}

}
