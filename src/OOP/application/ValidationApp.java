package OOP.application;

import OOP.data.LoginRequest;
import OOP.error.ValidationException;
import OOP.util.ValidationUtil;

public class ValidationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginRequest loginRequest = new LoginRequest(null, null);
		try {
			ValidationUtil.validate(loginRequest);
			System.out.println("Data Valid");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Terjadi error dengan pesan "+e.getMessage());
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			System.out.println("Terjadi error dengan pesan "+e.getMessage());
		} finally {
			System.out.println("ini akan muncul baik eror atau tidak");
		}
		
		
		LoginRequest loginRequest2 = new LoginRequest(null, null);
		ValidationUtil.ValidateRuntime(loginRequest2);
	}

}
