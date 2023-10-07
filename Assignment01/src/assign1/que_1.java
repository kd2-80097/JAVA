package assign1;

import java.util.Scanner;

public class que_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num ;
		System.out.println("Enter the number = ");
		num = s.nextInt();
		
		Integer num1;
		num1 = Integer.valueOf(num);
		System.out.println("Binary Equivalent = "+num1.toBinaryString(num));
		System.out.println("Hexdecimal Equivalent = "+num1.toHexString(num));
		System.out.println("Octal Equivalent = "+num1.toOctalString(num));

	}

}
