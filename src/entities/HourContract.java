package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hour;
	
	public HourContract() {
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hour) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}
	
	public Double totalValue() {
		return valuePerHour * hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

}
