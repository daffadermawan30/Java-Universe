package OOP;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var person1 = new Person("Daffa", "Tangerang");
		// setelah menggunakan constructor kita diwajibkan isi param atau akan error
		var person2 = new Person("Daffa");
//		var person3= new Person();
		
		System.out.println(person1);

		// object dasar
		
		person1.name = "Daffa Dermawan";
		person1.address = "Tangerang";
		// manipulasi Field atau attribute

		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);
		
		person1.sayHello("Eliza");
		// menggunakan method
		
		var person3 = new vicePresident("Dermawan");
		person3.sayHello("Bujang");
		// penggunaan class child
	}

}
