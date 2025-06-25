package OOP;

public class Person {
// class dasar
	
	String name;
	String address;
	final String country = "indonesia"; // variabel data yang gunakan final ga bisa di ubah lagi
	// field atau attribute
	
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", My Name Is " + name);
	}
	//method atau funtion dalam class
		
//	Person(String paramName, String paramAddress){ 
//		name = paramName;
//		address = paramAddress;
//		System.out.println("ini-1");
//	}
	//construction atau sebuah method yang akan otomatis berjalan saat object dibuat
	
	Person(String name){ 
		this(name, null);
		System.out.println("ini-2");
	}
	
	Person(){ 
		this(null);
		System.out.println("ini-3");
	}
	// construction overloading
	
//	Person(String name, String address){ 
//		name = name;
//		address = address;
//		"jika ini terjadi akan name hanya akan mengacu pada parameter bukan dari variable"
//		"variable shadowing -> namanya"
//	}
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
}
