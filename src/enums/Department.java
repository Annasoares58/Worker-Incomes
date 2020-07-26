package enums;

public enum Department {
	RH("RH"),
	MARKETING("Marketing"),
	IT("IT"),
	TAX("Tax"),
	FINANCE("Finance"), 
	SALES("Sales");
	
	String description;
	
	private Department(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
