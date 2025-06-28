package OOP.application;

import OOP.data.LoginRequest;

public class RecordApp {
	public static void main(String[] args) {
		LoginRequest loginRequest = new LoginRequest("Daffa", "Cinta & Rahasia");
		
		System.out.println(loginRequest);
		System.out.println(loginRequest.username());
		System.out.println(loginRequest.password());
		
		System.out.println(new LoginRequest("Dermawan", "siapkah kau tuk jatuh cinta"));
		System.out.println(new LoginRequest("Dermawan"));
		System.out.println(new LoginRequest());
		
	}
}
