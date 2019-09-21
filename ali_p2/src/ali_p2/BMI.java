package ali_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a Calculation Mode for your BMI - Enter 1 for lb or 2 for kg: ");
		int number = input.nextInt();
		
		if (number == 1) {
			System.out.println("Enter your weight in Pounds (to the nearest integer): ");
			double pounds = input.nextInt();
			
			System.out.println("Enter your height in Inches (to the nearest integer): ");
			double height = input.nextInt();
			
			double BMI_lb = (703 * pounds) / (height * height);
			
			System.out.printf("Your BMI is %.2f", BMI_lb);
		}
		
		if (number == 2) {
			System.out.println("Enter your weight in Kilograms (to the nearest integer): ");
			double kilograms = input.nextInt();
			
			System.out.println("Enter your height in Centimeters (to the nearest integer): ");
			
			double centimeter = input.nextInt();
			double meter = centimeter / 100;
			
			double BMI_kg = kilograms / (meter * meter);
			
			System.out.printf("Your BMI is %.2f", BMI_kg);

		}
		System.out.println("");
		System.out.println("");
		System.out.println("Here are the BMI Categories:");
		System.out.println("- Underweight = < 18.5");
		System.out.println("- Normal weight = 18.5 – 24.9");
		System.out.println("- Overweight = 25 – 29.9");
		System.out.println("- Obesity = BMI of 30 or greater");
		
		input.close();
	}
}
