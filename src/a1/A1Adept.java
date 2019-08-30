package a1;

import java.util.Scanner;

public class A1Adept {
	
	// static Scanner scan = new Scanner(System.in);

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
			
		//	individual_cost[i] = overall_cost;
			
			
		
		
		
		}
		String max = max_value(customer_name, individual_cost);
		String min = min_value(customer_name, individual_cost);
		String average = average_value(individual_cost);
		
		// System.out.println(customer_name[i] + ": " + individual_cost[i]);	
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
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	/*	double individual_cost = 0.0;
		double total_cost = 0.0;
		int total_customers = scan.nextInt();
		 // int individual_bought = scan.nextInt();
		
		for(int j=0; j<total_customers; j++) {
			// the outer loop will go through each individual item that the person bought
			String [] names = new String [total_customers];
			names[j] = scan.next();
			
			int individual_bought = scan.nextInt();
			
			for(int k=0; k<total_items_in_store;k++) {
				
				// this inner loop will calculate the cost of buying each item
				int count_one_item = scan.nextInt();
				
				if (scan.next() == food[k]) {
					individual_cost = count_one_item * prices[k];
					total_cost += individual_cost;
				}
			}
			
		}
		*/
		
		// System.out.println();
		
	//	scan.close();
		
		
		/* static double most_spent() {
			
		}
		
		
		*/
		
		
	/* 1.Scanner first reads scan.next.Int() which is total # of items in store
	 * Then reads word = scan.next();
	 * Then reads price = scan.nextDouble();
	 *  
	 * for(int i=0; i<total_items_in_store; i++) {
	 *  word = scan.next();
	 *  price = scan.nextDouble();
	 *  }
	 *  // how do i make a new variable for each
	 *  food item so that I can reference it later 
	 *  when I am trying to add up the cost?
	 *  
	 *  ^Can I create an array to store these names
	 *  of the food & their prices so I can later
	 *  access their prices
	 *  something like
	 *  
	 *  String [] all_food = [scan.nextInt()];
	 *  
	 *  if (all_food[i] == scan.next()) {
	 *  cost = price_of_food * amount_of_one_food;
	 *  }
	 *  
	 *  ^create another array just for prices?
	 *  double [] all_food_prices = [total_items_in_store];
	 *  
	 *  
	 *  2. Then it will read the # of customers
	 *  int number_of_customers = scan.nextInt();
	 *  
	 *  for(int j=0; j<number_of_customers;j++) {
	 *   if (all_food[i] == scan.next()) {
	 *  cost = price_of_food * amount_of_one_food;
	 *  }
	 *  }
	 *  
	 *  
	 *  nested for loops just for food name & food price?
	 *  
	 *  
	 *  3. Need methods to get who spent the most, who
	 *  spent the least, and the average money spent for
	 *  all customers
	 *  
	 *  4. For each individual person, first go through
	 *  first_name = scan.next();
	 *  total_bought = scan.nextInt();
	 *  
	 *  while (total_bought > 0
	 *  
	 *  
	 *  Do i need to make a variable for each food item?
	 *  and save their prices so later in my for loop i can 
	 *  write
	 *  if (food name .equals (scan.next()) {
	 * 	cost = food price * amount_of_one_food;
	 *  }
	 */
		
		
	}
	


