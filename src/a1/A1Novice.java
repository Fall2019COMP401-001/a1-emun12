package a1;

import java.util.Scanner;

public class A1Novice {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int total_customers = scan.nextInt();
		
		
		for(int i = 0; i < total_customers; i++) {
			
			char first_initial = scan.next().charAt(0);
			String last_name = scan.next();
			
			int total_bought = scan.nextInt();
			double temp = 0.0;
			// String.format("%.2f", temp);
			
			for(int j = 0; j < total_bought; j++) {
				// String.format("%.2f", temp);
				 temp = temp + total_sum();
				 // String.format("%.2f", temp);
				
			}
		
		 System.out.println(first_initial + ". " + last_name + ": " +  String.format("%.2f", temp) );
		}
		
		// System.out.println("hi");
		scan.close();
		
	}

		
		static double total_sum()  {
			//Scanner scan = new Scanner(System.in);
			
			int total_items = scan.nextInt();
			// double converting = total_items;
			String word = scan.next();
			double price = scan.nextDouble();
			double cost = 0.0;
			
			// double overall = 0.0;
			 String.format("%.2f", cost);
			
			while (total_items > 0) {
				cost = cost + price;
				total_items--;
				String.format("%.2f", cost);
			}
			
		//	scan.close();
			
			return cost;
			
			

			// double example = 1.42;
			// int exampleInt = (int)example;
			
			/* for (int i = 0; i < total_items; i++) {
				if (total_items > 1) {
					
					cost = converting * price;
					overall = overall + cost;
					total_items--;
				} else if (total_items == 1) {
					
					cost = converting * price;
					overall = overall + cost;
					total_items--;
				} else {
					
					overall = overall + cost;
				}
			}
			return overall;
			
			*/
			
		}
		
	
	/*
		// first try
		
		int total_customers = scan.nextInt();
		// gets the total number of customers
		
		
		char first_initial = scan.next().charAt(0);
		// gets the first letter of the person's name
		
		String last_name = scan.next();
		// gets the person's last name
		
		
		 int[] customers = new int[total_customers];
		// an array that puts each customer into one spot in the array
		
		int total = 0;
		// stores the total cost that the customer spent on groceries
		 */
		
	/*	for (int i = 0; i < customers.length; i++) {
			customers[i] = scan.nextInt();
			sum_total(customers[i]);
			
			break;
		} */
		// loops through each customer and gives their information to the other functions
		
		// System.out.println(first_initial + "." + last_name + ": " + total );
		
		
		// All input parsed, so close scanner
		// scan.close();
		
		

	
	
		/*
		static int sum_cost(int[]vals) {
			Scanner scan = new Scanner(System.in);
			double overall = 0.0;
			double price = scan.nextDouble();
			double items = scan.nextInt();
			double cost = 0.0;
			
			for(int i = 0; i < scan.nextInt(); i++) {
				if (items > 1) {
					cost = items * price;
					overall = overall + cost;
					items--;
				}
				else if (items == 1) {
					cost = items * price;
					overall = overall + cost;
					items--;
				} else {
					overall = overall + cost;
				}
			}
			
			return overall;
			
			*/
			
		}
		/*	Scanner scan = new Scanner(System.in);
			
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
		*/
		
	

