package ali_p1;

import java.util.Scanner;

public class Encrypt {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a four-digit integer to encrypt: ");
		int digit = input.nextInt();
		
		System.out.printf("This is the number you entered: %04d", digit);
		System.out.println("");
		
		int ones_place = ((digit % 10) + 7 ) % 10;
		int tens_place = (((digit % 100) / 10) + 7 ) % 10;
		int hundreds_place = (((digit % 1000) / 100) + 7 ) % 10;
		int thousands_place = ((digit / 1000) + 7 ) % 10;
		
		System.out.printf("This is the encrypted number: %d%d%d%d", tens_place, ones_place, thousands_place, hundreds_place);
		
		input.close();
	}
}