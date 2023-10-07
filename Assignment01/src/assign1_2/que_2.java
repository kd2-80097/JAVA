package assign1_2;

import java.util.Scanner;

public class que_2 {

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
