package OOP;

class Parent {
	String name;
	Parent(String name) {
		this.name = name;
	}
	void doIt() {		
		System.out.println("i am "+ this.name+ " is parent");
	}
}

class Child extends Parent {
	// String name; -> variabel hiding, variable tidak bisa di overriding seperti method dan bersifat independen
	// lebih disarankan gunakan di parent class nya saja dan gunakan super. untuk aksesnya
	Child(String name){
		super(name);
	}
	@Override
	void doIt() {
		System.out.println("do it in child");
		System.out.println("im Children and my name is " + this.name);
	}
}

class Work {
    String name;
    int salary;
    void work() {
    	System.out.println( "aku adalah kelas pekerja");
    }
}

class Farmer extends Work {
	@Override
	void work(){
		System.out.println("aku adalah "+ this.name +" petani yang cinta " + this.salary);
	}
}