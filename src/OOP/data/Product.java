package OOP.data;

import java.util.Objects;

public class Product {

	public String name;
	public int price;
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "product name: " + name + ", price " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	
	
}
