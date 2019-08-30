package a1;

import java.util.Scanner;

public class A1Adept {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Scanner scan = new Scanner(System.in);
		
		int total_products = scan.nextInt();
		
		String[] food = new String [total_products];
		double [] prices = new double [total_products];
		
		for(int i=0; i<total_products; i++) {
			food[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		// this loop puts in the food names and prices in 2 arrays
		
		
		
		int total_number_of_customers = scan.nextInt();
		double[] individual_cost = new double [total_number_of_customers];
		String[] customer_name = new String [total_number_of_customers];
		
		for(int i=0; i<total_number_of_customers; i++) {
			customer_name[i] = scan.next() + scan.next();
			int number_of_products = scan.nextInt();
			double overall_cost = 0.0;
			
			for(int j=0; j<number_of_products; j++) {
				int quantity = scan.nextInt();
				int food_position = 0;
				int price_position = 0;
				double cost = 0.0;
				
				
				for(int k=0; k<total_products; k++) {
					
					if(scan.next() == food[food_position]) {
						cost = quantity * prices[price_position];
						overall_cost = overall_cost + cost;
					} else {
						food_position++;
						price_position++;
					}
				}
			//	individual_cost[i] = overall_cost;
			//	System.out.println(overall_cost);
			}
			individual_cost[i] = overall_cost;
			System.out.println(individual_cost[0]);
			
		}
		
		scan.close();
		
		
		
		
		
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
	
	
}
