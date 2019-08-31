package a1;

import java.util.Scanner;

import a1.A1Novice;

public class A1Adept {

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
		
		double[] bills = new double[customers];
		
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
				
				for (int k = 0; k<items_in_store; k++) {
					
					if (item_customer_bought[j].equals(name_of_item[k])) {
						
						prices[j] = quantity_of_item_bought[j] * price_of_item[k];
						
					} 
					
				}
				
			}
			
			bills[i] = calculateValueSum(prices);
			
		}
		
		scan.close();
		
		
		double maximum = findValueMax(bills);
		String maximum_formatted = String.format("%.2f", maximum); 
		double minimum = findValueMin(bills);
		String minimum_formatted = String.format("%.2f", minimum); 
		int index_shopper_max = findIndexShopperMax(bills);
		int index_shopper_min = findIndexShopperMin(bills);
		double average = calculateValueAverage(bills);
		String average_formatted = String.format("%.2f", average);
	
		
		System.out.println("Biggest: " + first_names[index_shopper_max] + " " + last_names[index_shopper_max] + " " + "(" + maximum_formatted + ")");
		System.out.println("Smallest: " + first_names[index_shopper_min] + " " + last_names[index_shopper_min] + " " + "(" + minimum_formatted + ")");
		System.out.println("Average: " + average_formatted);
		
	}
	
	static double calculateValueSum(double[] vals) {
		
		double sum = 0.0;
		
		for (int i=0; i<vals.length; i++) {
			
			sum += vals[i];
		}
		
		return sum;
	}
	
	static double findValueMax(double[] vals) {
		
		double cur_max = vals[0];
		
		for (int i=0; i<vals.length; i++) {
			
			if (vals[i] > cur_max) {
				
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
	
	static int findIndexShopperMax(double[] vals) {
		
		double known_max = findValueMax(vals);
		
		int i = 0;
		
		while (i<vals.length) {
			
			if (vals[i] == known_max) {
				
				break;
				
			} else {
				
				i++;
			}
		}
		
		return i;
	}
	
	static double findValueMin(double[] vals) {
		
		double cur_min = vals[0];
		
		for (int i=0; i<vals.length; i++) {
			
			if (vals[i] < cur_min) {
				
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}
	
static int findIndexShopperMin(double[] vals) {
		
		double known_min = findValueMin(vals);
		
		int i = 0;
		
		while (i<vals.length) {
			
			if (vals[i] == known_min) {
				
				break;
				
			} else {
				
				i++;
			}
		}
		
		return i;
	}
	
	static double calculateValueAverage(double[] vals) {
		
		double average = calculateValueSum(vals)/vals.length;

		return average;
	}
}
