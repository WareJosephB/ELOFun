package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Player winner;
	private Player loser;
	private boolean sevenball;

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Player getLoser() {
		return this.loser;
	}

	public void setLoser(Player loser) {
		this.loser = loser;
	}

	public boolean isSevenball() {
		return sevenball;
	}

	public void setSevenball(boolean sevenball) {
		this.sevenball = sevenball;
	}

}
