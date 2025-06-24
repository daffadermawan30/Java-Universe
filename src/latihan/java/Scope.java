package latihan.java;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayHello("Daffa");
	}

	static void sayHello(String name) {
		String hello = "Hello " + name;
		if (!name.isBlank()) {
			String hi = "hello " + name;
			System.out.println(hi);
		}
		
		System.out.println(hello);
		// System.out.println(hi); // error
	}
}
