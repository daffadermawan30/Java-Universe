package OOP.application;

import static OOP.data.Application.PROCESSORS;
import static OOP.data.Constant.*;
//satic import
import OOP.data.Country;
import OOP.util.MathUtil;

public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(APPLICATION);
		System.out.println(VERSION);
		System.out.println(MathUtil.sum(1,2,3,1,2,3,21,2,9));
		
		Country.City city = new Country.City();
		city.setName("Tangerang");
		
		System.out.println(city.getName());
		
		System.out.println(PROCESSORS);
	}

}
