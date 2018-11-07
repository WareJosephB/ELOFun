package runner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		Player mahamed = new Player("Mahamed");
		Player dev = new Player("Dev");
		Player matt = new Player("Matt");
		Player vinul = new Player("Vinul");
		Player daud = new Player("Daud");
		Player malcolm = new Player("Malcolm");

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

		ELOCalc.Victory(mahamed, harrison);
		ELOCalc.Victory(andy, lewis);
		ELOCalc.Victory(gareth, joseph);
		ELOCalc.Victory(alvin, harrison);
		ELOCalc.Victory(lysien, daud, true);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(ben, andy);
		ELOCalc.Victory(harrison, naveed);
		ELOCalc.Victory(andy, joseph);
		ELOCalc.Victory(harrison, naveed);
		ELOCalc.Victory(matt, andy);
		ELOCalc.Victory(dev, joseph);
		ELOCalc.Victory(harrison, vinul);
		// End of day, 5th November
		
		ELOCalc.Victory(andy, gareth);
		ELOCalc.Victory(ben, joseph);
		ELOCalc.Victory(joseph, malcolm);
		ELOCalc.Victory(naveed, daud);
		ELOCalc.Victory(joseph, naveed);
		//End of day, 6th November
		
		ELOCalc.Victory(alvin, harrison);
		ELOCalc.Victory(lewis, malcolm);
		ELOCalc.Victory(joseph, gareth);
		ELOCalc.Victory(ben, dev);
		//End of day, 7th November

		
		
		List<Player> playerList =Arrays.asList(alvin, andy, ben, gareth, harrison, joseph, lewis, lysien, naveed, dev, vinul, daud, matt, mahamed, malcolm);
		Collections.sort(playerList, Comparator.comparing(i -> -i.getELO()));
		for (Player player : playerList) {
			System.out.println(player);
		}

		//System.out.println(ELOCalc.ExpectedScore(1849.24, 1475.11)*100);

	}

}
