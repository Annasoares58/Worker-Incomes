package enums;

public enum WorkerLevel {

		JUNIOR("Junior"),
		MID_LEVEL("Mid Level"),
		SENIOR("Senior");
	
	String description;
	
	private WorkerLevel(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
