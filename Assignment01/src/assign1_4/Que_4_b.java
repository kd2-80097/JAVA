package assign1_4;

/* 4. Write a program to generate following pattern
b)

      *
     ***
    *****
   *******
  *********
   *******
    *****
     ***
      *         */

public class Que_4_b {

	public static void main(String[] args) {

		int size = 5;
	    for (int i = 1; i <= size; i++)
	     {

	      for (int j = size; j > i; j--) 
	      {
	        System.out.print(" ");
	      }

	      for (int k = 0; k < i * 2 - 1; k++) 
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	     }

	    for (int i = 1; i <= size - 1; i++) 
	    {

	      for (int j = 0; j < i; j++) 
	      {
	        System.out.print(" ");
	      }

	      for (int k = (size - i) * 2 - 1; k > 0; k--) 
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	}

}