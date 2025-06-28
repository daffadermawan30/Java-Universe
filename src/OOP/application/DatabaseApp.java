package OOP.application;

import OOP.error.DatabaseError;

public class DatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		connectDatabase("admin", null);
		
	}
	
	public static void connectDatabase(String username, String password) {
		if (username == null || password == null) {
			throw new DatabaseError("tidak bisa konek ke database");
		}
	}

}
