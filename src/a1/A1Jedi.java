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
				
			 for(int j=0; j<products_bought; j++) {
					int quantity = scan.nextInt();
					String food_name = scan.next();
					int count = 0;
					
					for(int k=0; k<total_products; k++) {
						if(food_name.equals(food[k])){
							count = count + quantity;
							// overall_count = overall_count + count;
							count_array[k] = count;
						}
					}
			 }
		 }
		
		 
		 System.out.println(count_array[1]);
	}
}
