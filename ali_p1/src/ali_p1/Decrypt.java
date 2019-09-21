package ali_p1;

import java.util.Scanner;

public class Decrypt {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a four-digit integer to decrypt: ");
		int new_digit = input.nextInt();
		
		System.out.printf("This is the number you entered: %04d", new_digit);
		System.out.println("");
		
		int third_place = ((new_digit / 1000) + 10) - 7;
		int fourth_place = (((new_digit / 100) + 10) - 7) % 10;
		int first_place = (((new_digit / 10) + 10) - 7) % 10;
		int second_place = (((new_digit % 1000) + 10) - 7) % 10;
		
		System.out.printf("This is the decrypted number: %d%d%d%d", first_place, second_place, third_place, fourth_place);
		
		input.close();
	}
}
