package OOP;

class Manager extends Employee {
 
	String company;
	
	Manager(String name) {
		super(name);
	}
	
	Manager(String name, String company){
		super(name);
		this.company = company;
	}
	
	void sayHello(String name) {
		System.out.println("hello " + name + ", my name is " + this.name + " and i work in " + this.company);
	}

}

// ini adalah inheritance