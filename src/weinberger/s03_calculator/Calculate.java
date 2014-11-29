package weinberger.s03_calculator;

import java.util.List;

/**
 * 
 * Diese Interface schreibt vor, welche Methode in den Subklassen implementiert werden muss, damit berechnet werden kann.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-11-12
 *
 */
public interface Calculate {

	public List<Double> processCalculations(List<Double> values, double modifier);

}
