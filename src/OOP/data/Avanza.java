package OOP.data;

public class Avanza implements Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("brrrrmmmmmmm........");
	}
	@Override
	public int getTire() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Toyota";
	}
	@Override
	public boolean isMaintenance() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
