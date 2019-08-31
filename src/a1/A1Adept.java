package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		
		int total_products = scan.nextInt();
		
		String[] food = new String [total_products];
		double [] prices = new double [total_products];
		
		 for(int i=0; i<total_products; i++) {
			food[i] = scan.next();
			prices[i] = scan.nextDouble();
		} 
		 // this loop puts the name of the food inside an array
		 // this loop puts in the prices of the food inside an array
		
		int total_number_of_customers = scan.nextInt();
		double[] individual_cost = new double [total_number_of_customers];
		String[] customer_name = new String [total_number_of_customers];
		
		 
		for(int i=0; i<total_number_of_customers; i++) {
			customer_name[i] = scan.next(); 
			customer_name[i] += " " + scan.next();
			
			int number_of_products = scan.nextInt();
			double overall_cost = 0.0;
			// first for loop goes through all the customers
			
			for(int j=0; j<number_of_products; j++) {
				
				int quantity = scan.nextInt();
				String food_name = scan.next();

				
				double cost = 0.0; 
				// second for loop goes through how many products the customers bought
				
				for(int k=0; k<total_products; k++) {
					if(food_name.equals(food[k])) {
						cost = quantity * prices[k];
						overall_cost = overall_cost + cost;
					} 
					// third for loop calculates price of what they bought all together based on 
					// the quantity and the price of the food.
				}
				individual_cost[i] = overall_cost;
			}
		
		
		}
		String max = max_value(customer_name, individual_cost);
		String min = min_value(customer_name, individual_cost);
		String average = average_value(individual_cost);
			
		scan.close();
		
		System.out.println("Biggest: " + max);
		System.out.println(" Smallest: " + min);
		System.out.println(" Average: " + average);
		
	}

		static String max_value(String []name, double[] vals ){
			
			String spends_most = name[0];
			
			// Initialize current minimum to first value in array.
			double current = vals[0];
			
			// Starting with second value (if any), compare each value
			// in array with current minimum and replace if smaller.
			
			for (int i=1; i < vals.length; i++) {
				if (vals[i] > current) {
					current = vals[i];
					spends_most = name[i];
				}
			}
			
			// prints out the name of the person who spent the most money
			return spends_most + " (" + String.format("%.2f", current) + ")";
		}
		
		static String min_value(String[] name, double[] vals) {
			String spends_least = name[0];
			
			double current = vals[0];
			
			// Starting with second value (if any), compare each value
			// in array with current minimum and replace if smaller.
			
			for (int i=1; i < vals.length; i++) {
				if (vals[i] < current) {
					current = vals[i];
					spends_least = name[i];
				}
			}
			
			return spends_least + " (" + String.format("%.2f", current) + ")";
			
		}

		
		static String average_value(double[] vals) {
			
			double sum = 0;
			double division = vals.length;
			
			for (int i=0; i<vals.length; i++) {
				sum += vals[i];
			}
			
			return String.format("%.2f", sum/division);
		}
		
		
	}
	


