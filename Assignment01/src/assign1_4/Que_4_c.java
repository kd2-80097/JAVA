package assign1_4;

/* 4. Write a program to generate following pattern
c)

   *
   **
   ***
   ****
   *****
   ******          */

public class Que_4_c {
	
	public static void main(String[] args) {
		
		int size = 6;
	    
		for(int i = 0; i < size; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

		
		   