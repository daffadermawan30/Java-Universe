package OOP.application;

import OOP.data.CreateUserRequest;
import OOP.util.ValidationUtil;

public class ReflectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateUserRequest request = new CreateUserRequest();
		request.setUsername("DAFFA");
		request.setPassword("Dermawan");
		ValidationUtil.ValidationReflection(request);
	}

}
