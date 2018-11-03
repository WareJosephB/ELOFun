package run;

import util.ELOCalc;
import util.Player;

public class runner {

	public static void main(String[] args) {

		Player alvin = new Player("Alvin");
		Player andy = new Player("Andy");
		Player ben = new Player("Ben");
		Player gareth = new Player("Gareth");
		Player harrison = new Player("Harrison");
		Player joseph = new Player("Joseph");
		Player lewis = new Player("Lewis");
		Player lysien = new Player("Lysien");
		Player naveed = new Player("Naveed");

		ELOCalc.Victory(harrison, alvin);
		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(joseph, gareth);
		ELOCalc.Victory(ben, andy);
		ELOCalc.Victory(ben, harrison);
		// End of day 30th October

		ELOCalc.Victory(gareth, andy);
		ELOCalc.Victory(harrison, joseph);
		ELOCalc.Victory(naveed, andy);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(harrison, andy);
		ELOCalc.Victory(naveed, lewis);
		ELOCalc.Victory(naveed, lysien);
		ELOCalc.Victory(lysien, lewis);
		// End of day, 31st October

		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(harrison, alvin);
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

		Player[] playerList = new Player[] { alvin, andy, ben, gareth, harrison, joseph, lewis, lysien, naveed };

		for (Player player : playerList) {
			System.out.println(player);
		}

	}

}
