package OOP.data;

public record LoginRequest(String username, String password) {

	public LoginRequest {
		System.out.println("membuat object login req");
	}

	public LoginRequest(String username) {
		this(username, "");
	}
	
	public LoginRequest() {
		this("", "");
	}
}
