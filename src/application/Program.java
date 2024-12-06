package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = s.nextLine();
		System.out.print("Price: ");
		Double Price = s.nextDouble();
		System.out.print("Quantity in Stock: ");
		Integer quantity = s.nextInt();
		
		p = new Product(name, Price, quantity);
		System.out.println();
		System.out.println(p.toString());
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		Integer productsAdd = s.nextInt();
		System.out.println();
		p.addProduct(productsAdd);
		System.out.println(p.toString());
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		Integer productsRemove = s.nextInt();
		System.out.println();
		p.removeProduct(productsRemove);
		
		System.out.println(p.toString());
		
		s.close();
	}

}
