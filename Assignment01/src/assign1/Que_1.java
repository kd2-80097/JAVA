package assign1;

/* Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14 */

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num ;
		System.out.println("Enter the number = ");
		num = s.nextInt();
		
		System.out.println("Binary Equivalent = "+Integer.toBinaryString(num));
		System.out.println("Hexdecimal Equivalent = "+Integer.toHexString(num));
		System.out.println("Octal Equivalent = "+Integer.toOctalString(num));

	}

}
