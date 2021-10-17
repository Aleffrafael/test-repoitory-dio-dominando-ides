package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N:");
		int n =sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i=0 ; i<n; i++) {
			System.out.println("Product's name");
			String name = sc.next();
			System.out.println("Product's price");
			double price = sc.nextDouble();
			vect[i]= new Product(name,price);
			}
		
		double sum = 0.0;
		for (int i=0 ; i<n ;i++) {
			sum+=vect[i].getPrice();
		}
		
		double average = sum/n;
		System.out.printf("Average: %.2f%n",average);
		
			
			
			
		}
		
		
		
		

	}

