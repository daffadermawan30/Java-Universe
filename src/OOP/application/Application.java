package OOP.application;

import OOP.data.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product("Mac Book Pro", 30_000_000);
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product);
		
		Product product2 = new Product("Mac Book Pro", 30_000_000);
		System.out.println(product.equals(product2));
		System.out.println(product.hashCode() == product2.hashCode());
	}

}
