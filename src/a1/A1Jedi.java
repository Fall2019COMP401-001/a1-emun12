package a1;

import java.util.Scanner;

public class A1Jedi {

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
		 
		 
		 
		 int number_of_customers = scan.nextInt();
		 String[] customer_name = new String[number_of_customers];
		 int [] quantity_array = new int [total_products];
		// String [] food_store = new String[total_products];
		 int[] customer_count = new int[total_products];
		 
		 for(int i=0; i<number_of_customers; i++) {
			customer_name[i] = scan.next();
			customer_name[i] += scan.next();
			int [] food_store = new int[total_products];
			
			int products_bought = scan.nextInt();
			// int [] food_store = new int[total_products];
			
			for(int j=0; j<products_bought; j++) {
				int quantity = scan.nextInt();
				String food_name = scan.next();
				
				
				for(int k=0; k<total_products; k++) {
					if(food_name.equals(food[k])) {
						quantity_array[k] += quantity;
						// food_store[k] = food_name;
						food_store[k] += 1;
						
						if(food_store[k] > 1) {
							customer_count[k] += 1;
					
						} else {
							customer_count[k] = 1;
							
						}
						
						/*if(food_store[k] == null) {
							customer_count[k] = 1;
						} else {
							customer_count[k] += 1;
						}
						*/
					}
				}
				
			}
		 }
			 scan.close();
		 
		 for (int i=0; i<total_products; i++) {
			 if(customer_count[i] == 0) {
				 System.out.println("No customers bought " + food[i]);
			 } else {
				 System.out.println(customer_count[i] + " customers bought " + quantity_array[i] + " " + food[i]);
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/* 
		 int total_customers = scan.nextInt();
		 String [] customer_name = new String[total_customers];
		 int[] count_array = new int [total_products];
		 int[] customer_bought = new int[total_products];
		 
		// int overall_count = 0;
		 for(int i=0; i<total_customers;i++) {
			customer_name[i] = scan.next();
			customer_name[i] += " " + scan.next();
			// This loop goes through every customer.
			int products_bought = scan.nextInt();
				
			 for(int j=0; j<products_bought; j++) {
					int quantity = scan.nextInt();
					String food_name = scan.next();
					String food_copyname[] = new String[products_bought];
					food_copyname[j] = food_name;
 					
					/*for(int c=0; c<1;c++) {
						food_copyname[c] = food_name;
					}
					*/
				
					
					// for(int k=0; k<total_products; k++) {
					
					//	if(food_name.equals(food[k])) {
							
						//	count_array[k] = count_array[k] + quantity;
						//	customer_bought[k] = customer_bought[k] + 1;
							
			
							
							/*if(food_name.equals(food_copyname[k+1])) {
								customer_bought[k] = 1;
							} else {
								customer_bought[k] = customer_bought[k] + 1;
							}
							
							*/
							/*if(food_copyname.equals(food_name)){
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = 1;
							} else {
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = customer_bought[k] + 1;
							}
							*/
						}
						
						
					/*	if(food_name.equals(food[k]) && customer_name[k].equals(customer_name[k])){
							count_array[k] = count_array[k] + quantity;
							customer_bought[k] = 1;
							// overall_count = overall_count + count;
							//count_array[k] = count;
						
						} else {
							count_array[k] = count_array[k] + quantity;
							customer_bought[k] = customer_bought[k] + 1;
						}
					
					*/
						
					/*	if(food_name.equals(food[k])){
							if(customer_name[k].equals(customer_name[i])) {
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = 1;
							} else {
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = customer_bought[k] + 1;
							}
						}
						
						*/
					
					
			 
			// count_array[i] = count;
			 
			 // DON'T make an array for each customer.
			 // instead make a total count array near the end.
			 // Like just make a count in the for loop and put that final count inside the final count array.
			 
			 /* Count how many of one item the customer bought & how many customers bought one item
			  * int item_count = 0;
			  * int customer_count = 0;
			  */
			
		 
		 
		 
	/*	 for (int i=0; i<total_products; i++) {
			 if(count_array[i] == 0) {
				 System.out.println("No customers bought " + food[i]);
			 } else {
				 System.out.println(customer_bought[i] + " customers bought " + count_array[i] + " " + food[i]);
			 }
		 }
		 
		*/
		
		// System.out.println(count_array[0] + " " + count_array[1] + count_array[2] + count_array[3] + count_array[4] + count_array[5]);
		// System.out.println(customer_bought[0] + " " + customer_bought[1] + customer_bought[2]);
	//	 System.out.println("bought" + count_array[1] + count_array[2] + count_array[3]);
		
	}

