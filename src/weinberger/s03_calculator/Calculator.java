package weinberger.s03_calculator;

import java.util.*;

/**
 * Die abstrakte Klasse Calculator hat die Aufgabe, Werte aus einer Liste mit einem modifier zu verändern und 
 * das Ergebnis als neue Liste zurück zu geben. 
 * 
 * Dazu dient die abstrakte Methode processCalculations, die in den konkreten Subklassen so überschrieben wurde,
 * dass sie je nach Klasse die Werte aus der Liste mit dem modifier addiert, subtrahiert, multipliziert oder dividiert.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-11-12
 */
public class Calculator {

	private List<Double> values;
	private double modifier;
	private Calculate operator;

	/**
	 * 
	 */
	public Calculator() {
		this.operator = new Addition();
	}
	
	/**
	 * 
	 * @param value
	 */
	public void addValue(double value) {
		values.add(value);
	}

	/**
	 * 
	 * @param modifier
	 */
	public void setModifier(double modifier) {
		this.modifier = modifier;
	}

	/**
	 * 
	 * @param value
	 */
	public void removeValue(double value) {
		values.remove(""+value);
	}

	/**
	 * 
	 * @return
	 */
	public List<Double> processCalculations() {
		return operator.processCalculations();
	}

	/**
	 * 
	 */
	public String toString() {
		String out = "";
		Iterator<Double> in = values.iterator();
		while (in.hasNext()) {
			out = "" + in.next() + "\n";
		}
		return out;
	}
	
	/**
	 * 
	 * @param operator
	 */
	public void setCalculation(Calculate operator) {
		this.operator = operator;
	}
	
	
	//--------------------------
	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.processCalculations();
		
		test.setCalculation(new Division());
		
		test.processCalculations();
		
	}
}
