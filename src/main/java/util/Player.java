package util;

import java.text.DecimalFormat;

public class Player {

	private String name;
	private double ELO;
	
	public Player(String name) {
		this.name = name;
		this.setELO(1500);
	}
	
	public double getELO() {
		return this.ELO;
	}
	
	public void setELO(double ELO) {
		this.ELO = ELO;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		DecimalFormat stripDecimal = new DecimalFormat("#.00");
		return this.getName() + ": " + stripDecimal.format(this.getELO());
	}
	
}
