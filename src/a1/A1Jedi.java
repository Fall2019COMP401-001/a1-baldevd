package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int items_in_store = scan.nextInt();
		
		String[] name_of_item = new String[items_in_store]; 
		
		double[] price_of_item = new double [items_in_store];
		
		for (int i=0; i<items_in_store; i++) {
			
			name_of_item[i] = scan.next();
			
			price_of_item[i] = scan.nextDouble();
			
		}
		
		int customers = scan.nextInt();
		
		String[] first_names = new String[customers];
		
		String[] last_names = new String[customers];
		
		int[] customer_count = new int[items_in_store];
		
		int[] item_count = new int[items_in_store];
		
		for (int i=0; i<customers; i++) {
			
			first_names[i] = scan.next();
			
			last_names[i] = scan.next();
			
			int number_of_items_bought = scan.nextInt();
			
			int[] quantity_of_item_bought = new int[number_of_items_bought];
				
			String[] item_customer_bought = new String[number_of_items_bought];
			
			double[] prices = new double[number_of_items_bought];
			
			for (int j=0; j<number_of_items_bought; j++) {
				
				quantity_of_item_bought[j] = scan.nextInt();
					
				item_customer_bought[j] = scan.next();
			
			}
				
			for (int k=0; k<items_in_store; k++) {
				
				for (int l=0; l<number_of_items_bought; l++) {
					
					if (name_of_item[k].equals(item_customer_bought[l])) {
						
						item_count[k] += quantity_of_item_bought[l];
					
					} else {
						
						item_count[k] = item_count[k];
					}
				}
				
			}
			
			for (int k=0; k<items_in_store; k++) {
				
				for (int l=0; l<number_of_items_bought; l++) {
					
					if (name_of_item[k].equals(item_customer_bought[l])) {
						
						customer_count[k]++;
						break;
					
					} else {
						
						customer_count[k] = customer_count[k];
					}
				}
				
			}
		
		}
		
		for (int i=0; i<items_in_store; i++) {
			
			if (item_count[i] == 0) {
				
				System.out.println("No customers bought " + name_of_item[i]);
				
			} else for (int j=0; j<100; j++) {
				
				if (item_count[i] == j) {
					
					System.out.println(customer_count[i] + " customers bought " + j + " " + name_of_item[i]);
				}
			}
		}
		
		
	}
}
	
