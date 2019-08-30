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
		 
		// int overall_count = 0;
		 
		 
		 for(int i=0; i<total_customers;i++) {
			customer_name[i] = scan.next();
			customer_name[i] += " " + scan.next();
			
			int products_bought = scan.nextInt();
			int count = 0;
				
			 for(int j=0; j<products_bought; j++) {
					int quantity = scan.nextInt();
					String food_name = scan.next();
					
					
					for(int k=0; k<total_products; k++) {
						if(food_name.equals(food[k])){
							count = count + quantity;
							// overall_count = overall_count + count;
							//count_array[k] = count;
						}
					}
			 }
			 count_array[i] = count;
			 
			 // DON'T make an array for each customer.
			 // instead make a total count array near the end.
			 // Like just make a count in the for loop and put that final count inside the final count array.
			 
			 /* Count how many of one item the customer bought & how many customers bought one item
			  * int item_count = 0;
			  * int customer_count = 0;
			  */
			
		 }
		
		 
		 System.out.println("bought" + count_array[1]);
	}
}
