package ali_p3;

import java.util.Scanner;

public class Poll {

	public static void main(String[] args) {
		int i;
		int flag = 0;
		double max = 0;
		double min = 1000000;
		double first_row_sum = 0;
		double second_row_sum = 0;
		double third_row_sum = 0;
		double fourth_row_sum = 0;
		double fifth_row_sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		String topics[] = {"Pizza", "Fries", "Salads", "Chicken", "Cookies"};
		
		int responses[][] = { {0,0,0,0,0,0,0,0,0,0},
				      {0,0,0,0,0,0,0,0,0,0},
				      {0,0,0,0,0,0,0,0,0,0},
				      {0,0,0,0,0,0,0,0,0,0},
				      {0,0,0,0,0,0,0,0,0,0}
		};
		
		System.out.println("This is a poll.");
		System.out.println("Please rate these five food topics from 1 (least important) to 10 (most important): ");
			
		while (flag == 0) {
			for(i = 0; i < 5; i++) {
				System.out.printf("%s", topics[i]);

				System.out.println("");

				int score = input.nextInt();

				responses[i][score-1] += 1;

				if (i == 0)
					first_row_sum += score;
				if (i == 1)
					second_row_sum += score;
				if (i == 2)
					third_row_sum += score;
				if (i == 3)
					fourth_row_sum += score;
				if (i == 4)
					fifth_row_sum += score;
			}
				
			if (i == 5) {
				System.out.println("Would another person like to do this poll? Enter 1 for yes or 2 for no.");
				int next = input.nextInt();
				
				if (next == 1) {
					i = 0;
				}
				
				if (next == 2) {
					flag = 1;
				}
			}
		}
		
		double first_row_average = first_row_sum / 10;
		double second_row_average = second_row_sum / 10;
		double third_row_average = third_row_sum / 10;
		double fourth_row_average = fourth_row_sum / 10;
		double fifth_row_average = fifth_row_sum / 10;
		
		System.out.println("Here is a tabular report, with the average of the ratings at the end of each food.");
		System.out.println("");
		System.out.println("Topics   1  2  3  4  5  6  7  8  9  10| Average ");
		System.out.println("------------------------------------------------");
		System.out.print("Pizza    " + responses[0][0]+ "  "+ responses[0][1] + "  " + responses[0][2] + "  ");
		System.out.print(responses[0][3]+ "  " + responses[0][4] + "  " + responses[0][5] + "  ");
		System.out.print(responses[0][6]+ "  " + responses[0][7] + "  " + responses[0][8] + "  ");
		System.out.print(responses[0][9]+ " | " + first_row_average);
		System.out.println("");
		System.out.print("Fries    " + responses[1][0]+ "  " + responses[1][1]+ "  " + responses[1][2] + "  ");
		System.out.print(responses[1][3]+ "  " + responses[1][4] + "  " + responses[1][5] + "  ");
		System.out.print(responses[1][6]+ "  " + responses[1][7] + "  " + responses[1][8] + "  ");
		System.out.print(responses[1][9]+ " | " + second_row_average);
		System.out.println("");
		System.out.print("Salads   " + responses[2][0]+ "  " + responses[2][1]+ "  " + responses[2][2] + "  ");
		System.out.print(responses[2][3]+ "  " + responses[2][4] + "  " + responses[2][5] + "  ");
		System.out.print(responses[2][6]+ "  " + responses[2][7] + "  " + responses[2][8] + "  ");
		System.out.print(responses[2][9]+ " | " + third_row_average);
		System.out.println("");
		System.out.print("Chicken  " + responses[3][0]+ "  " + responses[3][1]+ "  " + responses[3][2] + "  ");
		System.out.print(responses[3][3]+ "  " + responses[3][4] + "  " + responses[3][5] + "  ");
		System.out.print(responses[3][6]+ "  " + responses[3][7] + "  " + responses[3][8] + "  ");
		System.out.print(responses[3][9]+ " | " + fourth_row_average);
		System.out.println("");
		System.out.print("Cookies  " + responses[4][0]+ "  " + responses[4][1]+ "  " + responses[4][2] + "  ");
		System.out.print(responses[4][3]+ "  " + responses[4][4] + "  " + responses[4][5] + "  ");
		System.out.print(responses[4][6]+ "  " + responses[4][7] + "  " + responses[4][8] + "  ");
		System.out.print(responses[4][9]+ " | " + fifth_row_average);
		System.out.println("");
		
		if (first_row_sum >= max)
			max = first_row_sum;
		if (second_row_sum > max)
			max = second_row_sum;
		if (third_row_sum > max)
			max = third_row_sum;
		if (fourth_row_sum > max)
			max = fourth_row_sum;
		if (fifth_row_sum > max)
			max = fifth_row_sum;

		if (first_row_sum <= min)
			min = first_row_sum;
		if (second_row_sum < min)
			min = second_row_sum;
		if (third_row_sum < min)
			min = third_row_sum;
		if (fourth_row_sum < min)
			min = fourth_row_sum;
		if (fifth_row_sum < min)
			min = fifth_row_sum;

		System.out.println("");
		
		if (first_row_sum == max) {
			System.out.printf("Pizza has the most point: %.2f Points", first_row_sum);
			System.out.println("");
		} else if (second_row_sum == max){
			System.out.printf("Fries has the most point: %.2f Points", second_row_sum);
			System.out.println("");
		} else if (third_row_sum == max){
			System.out.printf("Salads has the most point: %.2f Points", third_row_sum);
			System.out.println("");
		} else if (fourth_row_sum == max){
			System.out.printf("Chicken has the most point: %.2f Points", fourth_row_sum);
			System.out.println(""); 
		} else if (fifth_row_sum == max){
			System.out.printf("Cookies has the most point: %.2f Points", fifth_row_sum);
			System.out.println("");
		} 
		
		if (first_row_sum == min) {
			System.out.printf("Pizza has the least point: %.2f Points", first_row_sum);
			System.out.println("");
		} else if (second_row_sum == min){
			System.out.printf("Fries has the least point: %.2f Points", second_row_sum);
			System.out.println("");
		} else if (third_row_sum == min){
			System.out.printf("Salads has the least point: %.2f Points", third_row_sum);
			System.out.println("");
		} else if (fourth_row_sum == min){
			System.out.printf("Chicken has the least point: %.2f Points", fourth_row_sum);
			System.out.println("");
		} else if (fifth_row_sum == min){
			System.out.printf("Cookies has the least point: %.2f Points", fifth_row_sum);
			System.out.println("");
		}
		
		input.close();

	}
}
