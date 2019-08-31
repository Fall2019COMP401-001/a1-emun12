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
			// int count = 0;
				
			 for(int j=0; j<products_bought; j++) {
					int quantity = scan.nextInt();
					String food_name = scan.next();
					
					// This loop goes through the amount of products they bought.
					
					for(int k=0; k<total_products; k++) {
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
						
						if(food_name.equals(food[k])){
							if(customer_name[i].equals(customer_name[i])) {
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = 1;
							} else {
								count_array[k] = count_array[k] + quantity;
								customer_bought[k] = customer_bought[k] + 1;
							}
						}
					} 
					
			 }
			// count_array[i] = count;
			 
			 // DON'T make an array for each customer.
			 // instead make a total count array near the end.
			 // Like just make a count in the for loop and put that final count inside the final count array.
			 
			 /* Count how many of one item the customer bought & how many customers bought one item
			  * int item_count = 0;
			  * int customer_count = 0;
			  */
			
		 }
		 
		 
		 for (int i=0; i<total_products; i++) {
			 if(count_array[i] == 0) {
				 System.out.println("No customers bought " + food[i]);
			 } else {
				 System.out.println(customer_bought[i] + " customers bought " + count_array[i] + " " + food[i]);
			 }
		 }
		 
		
		
		// System.out.println(count_array[0] + " " + count_array[1] + count_array[2] + count_array[3] + count_array[4] + count_array[5]);
		// System.out.println(customer_bought[0] + " " + customer_bought[1] + customer_bought[2]);
	//	 System.out.println("bought" + count_array[1] + count_array[2] + count_array[3]);
		
	}
}
