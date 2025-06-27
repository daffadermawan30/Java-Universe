package OOP.application;

import OOP.data.Avanza;
import OOP.data.Bus;
import OOP.data.Car;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Avanza();
		System.out.println(car.getTire());
		car.drive();
		car.isMaintenance();
		car.isBig();
		
		Car car1 = new Bus();
		System.out.println(car1.isBig());
		
	}

}
