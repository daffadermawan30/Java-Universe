package OOP;

public class VicePresident extends Manager {
	VicePresident(String name){
		super(name);
	}
	
	@Override
	void sayHello(String name) {
		System.out.println("Hello " + name + " Im is your Boss " + this.name);
	}
	
	
}


