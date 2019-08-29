package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char first_initial = scan.next().charAt(0);
		// gets the first letter of the person's name
		
		String last_name = scan.next();
		// gets the person's last name

		int total_customers = scan.nextInt();
		// scans in how many customers there are total
		
		int[] customers = new int[total_customers];
		// an array that puts each customer into one spot in the array
		
		int total_cost = 0;
		// stores the total cost that the customer spent on groceries
		
	/*	for (int i = 0; i < customers.length; i++) {
			customers[i] = scan.nextInt();
			sum_total(customers[i]);
			
			break;
		} */
		// loops through each customer and gives their information to the other functions
		
		System.out.println(first_initial + "." + last_name + ":" + total_cost );
		
		
		// All input parsed, so close scanner
		scan.close();
		
		static int sum_total(int[]customers) {
			
			total_cost = 
			
		}
		
		
		
		
		
		
	}
}
