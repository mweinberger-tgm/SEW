package weinberger.s03_calculator;

import java.util.*;

/**
 * 
 * Implementiert die Funktion, die einzelnen Zahlen aus der Liste mit dem Modifier zu multiplizieren.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-11-12
 * 
 */
public class Multiplication implements Calculate {

	/**
	 * 
	 * Die eigentliche Funktion, implementiert als Modul mithilfe des Strategy-Pattern.
	 * 
	 * @return out Die fertig berechnete Liste.
	 * 
	 */
	public List<Double> processCalculations(List<Double> values, double modifier) {
		List<Double> out = new Vector<Double>();
		
		Iterator<Double> it = values.iterator();
		while (it.hasNext()) {
			out.add(it.next() * modifier);
		}
		
		return out;
	}

}
