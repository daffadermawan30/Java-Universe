package OOP.application;

import OOP.data.Customer;
import OOP.data.Level;

public class EnumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setName("Daffa Dermawan");
		customer.setLevel(Level.PREMIUM);
		System.out.println(customer.getName());
		System.out.println(customer.getLevel());
		System.out.println(customer.getLevel().getDescription());
		
		String levelName = Level.VIP.name();
		System.out.println(levelName);
		Level level = Level.valueOf("PREMIUM"); //kalo misalnya menggunkana string yang tidak ada pada class enum akan eror
		System.out.println(level);
		
		Level[] levels = Level.values();
		System.out.println(levels);
		
		System.out.println();
		for (var value : Level.values()) {
			System.out.println(value);
		}
	}

}
