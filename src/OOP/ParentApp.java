package OOP;

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child("Daffa");
		child.doIt();
		
		Parent parent = (Child) child;
		parent.doIt();
		
		Farmer farm = new Farmer();
		farm.name = "Raffi";
		farm.salary = 300_000;
		farm.work();
	}

}
