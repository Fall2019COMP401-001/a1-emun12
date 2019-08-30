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
			
			
			for(int j = 0; j < total_bought; j++) {
				
				 temp = temp + total_sum();
				 
				
			}
		
		 System.out.println(first_initial + ". " + last_name + ": " +  String.format("%.2f", temp) );
		}
		
		scan.close();
		
	}

		static double total_sum()  {
		
			int total_items = scan.nextInt();
			String word = scan.next();
			double price = scan.nextDouble();
			double cost = 0.0;
			
			while (total_items > 0) {
				cost = cost + price;
				total_items--;
			}
			
			return cost;
			
		}
		
	}
	
		
	

