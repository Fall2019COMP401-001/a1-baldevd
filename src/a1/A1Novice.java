package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count_customers = scan.nextInt();
		
		for (int i = 0; i < count_customers; i++) {
		
			char first_initial = scan.next().charAt(0);
		
			String last_name = scan.next();
		
			int total_amount = scan.nextInt();
		
			int[] quantities = new int[total_amount];
		
			String[] item = new String[total_amount];
		
			double[] prices = new double[total_amount];
		
			for (int j = 0; j < total_amount; j++) {
			
				quantities[j] = scan.nextInt();
			
				item[j] = scan.next();
			
				prices[j] = scan.nextDouble();
			
			}
		
			double[] receipt = new double[total_amount];
		
			for (int k = 0; k < total_amount; k++) {
			
				receipt[k] = quantities[k] * prices[k];
			}
		
			double print = 0.0;
		
			for (int l = 0; l < total_amount; l++) {
			
				print += receipt[l];
				
			}
		
		System.out.println(first_initial + ". " + last_name + ": " + String.format("%.2f", print));	
		
		}
		
		scan.close();
		
		
	}	
	
}
	



