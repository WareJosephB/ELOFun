package runner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import util.ELOCalc;
import util.Player;

public class Iterator {

	public static void main(String[] args) {

		Player andy = new Player("Andy");
		Player ben = new Player("Ben");
		Player gareth = new Player("Gareth");
		Player harrison = new Player("Harrison");
		Player joseph = new Player("Joseph");
		Player lewis = new Player("Lewis");
		Player naveed = new Player("Naveed");

		for (int i = 0; i < 10; i++) {
		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(joseph, gareth);
		ELOCalc.Victory(ben, andy);
		ELOCalc.Victory(ben, harrison);
		// End of day 30th October

		ELOCalc.Victory(gareth, andy);
		ELOCalc.Victory(harrison, joseph);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(harrison, andy);
		ELOCalc.Victory(naveed, lewis);
		
		// End of day, 31st October

		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(ben, gareth);
		ELOCalc.Victory(lewis, joseph);
		// End of day, 1st November

		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(andy, joseph);
		ELOCalc.Victory(joseph, gareth);
		ELOCalc.Victory(ben, harrison);
		ELOCalc.Victory(harrison, andy);
		ELOCalc.Victory(ben, harrison);
		// End of day, 2nd November

		ELOCalc.Victory(andy, lewis);
		ELOCalc.Victory(gareth, joseph);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(ben, andy);
		ELOCalc.Victory(harrison, naveed);
		ELOCalc.Victory(andy, joseph);
		ELOCalc.Victory(harrison, naveed);
		// End of day, 5th November
		
		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(joseph, naveed);
		//End of day, 6th November
		
		
		ELOCalc.Victory(joseph, gareth);}
		
		//End of day, 7th November

		
		
		List<Player> playerList =Arrays.asList(andy, ben, gareth, harrison, joseph, lewis, naveed);
		Collections.sort(playerList, Comparator.comparing(i -> -i.getELO()));
		for (Player player : playerList) {
			System.out.println(player);
		}

		// System.out.println(ELOCalc.ExpectedScore(1859.54, 1454.42)*100);

	}

}
