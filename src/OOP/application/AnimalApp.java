package OOP.application;

import OOP.annotation.Fancy;
import OOP.data.*;

@Fancy(name = "AnimalApp", tags = {"application","Java"})
public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.name = "Buna";
		cat.run();
		
	}

}
