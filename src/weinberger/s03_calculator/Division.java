package weinberger.s03_calculator;

import java.util.*;

public class Division implements Calculate {

	public List<Double> processCalculations(List<Double> values, double modifier) {
		List<Double> out = new Vector<Double>();
		
		Iterator<Double> it = values.iterator();
		while (it.hasNext()) {
			out.add(it.next() / modifier);
		}
		
		return out;
	}

}
