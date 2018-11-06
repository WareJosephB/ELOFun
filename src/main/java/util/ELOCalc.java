package util;

public class ELOCalc {

	public static double ExpectedScore(double ELO1, double ELO2) {
		double E = Math.pow(10, (ELO2 - ELO1)/400);
		return Math.pow(1 + E, -1);

	}
	
	public static double ELOChange(double ELO1, double ELO2, double score, int weighting) {
		return ELO1+weighting*(score-ExpectedScore(ELO1, ELO2));
	}
	
	public static void Victory(Player winner, Player loser) {
		UpdateELO(winner, loser, false);
		
	}
	
	public static void Victory(Player winner, Player loser, boolean Sevenballed) {
		UpdateELO(winner, loser, Sevenballed);
	}
	
	private static void UpdateELO(Player winner, Player loser, boolean Sevenballed) {
		int K;
		if (Sevenballed) {
			K = 32;
		} else {
			K = 16;
		}
		double temp = winner.getELO();
		winner.playGame();
		loser.playGame();
		winner.setELO(ELOChange(winner.getELO(), loser.getELO(), 1, K));
		loser.setELO(ELOChange(loser.getELO(), temp, 0, K));
	}
	

}
