package OOP.data;

public enum Level {
	STANDAR("Standard edition"), 
	PREMIUM("Premium edition"), 
	VIP("VIP edition");
	
	private String description;
	
	Level(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
