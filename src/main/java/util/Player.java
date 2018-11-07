package util;

import java.text.DecimalFormat;

public class Player {

	private String name;
	private double ELO;
	private int gamesPlayed;
	
	public Player(String name) {
		this.name = name;
		this.setELO(1500);
		this.gamesPlayed = 0;
	}
	
	public void playGame() {
		this.gamesPlayed += 1;
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
		return this.getName() + ": " + stripDecimal.format(this.getELO())+ " from " +String.valueOf(this.gamesPlayed) + " games played.";
	}

}
