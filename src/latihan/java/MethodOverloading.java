package latihan.java;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();
		sayHello("daffa");
		
		sayHello("daffa", "dermawan");

	}
	
	// kita tak bisa bikin method dengan nama yang sama lebih dari sekali kecuali parameternya dibedakan
	static void sayHello() {
		System.out.println("hello");
	}
	static void sayHello(String firstName) {
		System.out.printf("hello %s", firstName);
	}
	static void sayHello(String firstName, String lastName) {
		System.out.printf("\nhello %s %s", firstName, lastName);
	}

}
