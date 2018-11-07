package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	private String name;
	private double ELO;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Player(String name) {
		this.name = name;
		this.ELO = 1500;
	}

	public Player(String name, double ELOEst) {
		this.name = name;
		this.ELO = ELOEst;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getELO() {
		return ELO;
	}

	public void setELO(double ELO) {
		this.ELO = ELO;
	}

}
