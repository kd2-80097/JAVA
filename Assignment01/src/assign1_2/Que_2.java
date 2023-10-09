package assign1_2;

/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average. */

import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double num=0,num1=0 ;
   
      System.out.println("Please enter the 1st number = ");
      if(s.hasNextDouble() && !s.hasNextInt()) 
      {
         num = s.nextDouble();
         System.out.println("Please enter the 2nd number = ");
         if(s.hasNextDouble() && !s.hasNextInt()) 
            {
                num1 = s.nextDouble();
            }
         else 
            {
    	  System.out.println("Please enter the valid number");
            }
      }
      else
      {
    	  System.out.println("Please enter the valid number");    	  
      }
      
      System.out.println("Average = "+((num+num1)/2));
      
		
	}

}
