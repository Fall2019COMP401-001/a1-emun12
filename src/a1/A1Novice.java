package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int total_customers = scan.nextInt();
		// gets the total number of customers
		
		for(int i = 0; i < total_customers; i++) {
			
		
		char first_initial = scan.next().charAt(0);
		// gets the first letter of the person's name
		
		String last_name = scan.next();
		// gets the person's last name
		System.out.println(first_initial + "." + last_name + ": " );
		// add + total;
		
		}
		
		 int[] customers = new int[total_customers];
		// an array that puts each customer into one spot in the array
		
		int total = 0;
		// stores the total cost that the customer spent on groceries
		
	/*	for (int i = 0; i < customers.length; i++) {
			customers[i] = scan.nextInt();
			sum_total(customers[i]);
			
			break;
		} */
		// loops through each customer and gives their information to the other functions
		
		
		
		
		// System.out.println(first_initial + "." + last_name + ": " + total );
		
		
		// All input parsed, so close scanner
		scan.close();
		
	}
	
		
		static int sum_cost(int[]vals) {
			Scanner scan = new Scanner(System.in);
			
			int total_of_one_food = scan.nextInt();
			int first_food = scan.nextInt();
			int price = scan.nextInt();
			int total_cost = 0;
			int cost = 0;
			
			while (total_of_one_food > 0) {
				if(first_food > 1) {
					cost = total_of_one_food * price;
					first_food--;
					total_cost = total_cost + cost;
				}
				else {
					cost = total_of_one_food * price;
					total_cost = total_cost + cost;
				}
			}
			
			return total_cost;
	
		}
		
		
		
		
		
		
		
	
}
