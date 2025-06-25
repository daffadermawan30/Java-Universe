package OOP;

public class Manager {
 
	String name;
	
	void sayHello(String name) {
		System.out.println("hello " + name + ", my name is " + this.name);
	}
	
	Manager(String name) {
		this.name = name;
	}

}

class vicePresident extends Manager {
	@Override
	void sayHello(String name) {
		System.out.println("Hello " + name + " Im is your Boss " + this.name);
	}
	
	vicePresident(String name){
		super(name);
	}
}
// ini adalah inheritance