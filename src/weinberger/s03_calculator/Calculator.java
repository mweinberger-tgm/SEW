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

	private List<Double> values = new Vector<Double>();
	private double modifier;
	private Calculate operator;

	/**
	 * 
	 * Der Konstruktor, der Addtion als Standard-Rechenoperation setzt.
	 * 
	 */
	public Calculator() {
		this.operator = new Addition();
	}
	
	/**
	 * 
	 * Fuegt einen Double-Wert der Liste hinzu.
	 * 
	 * @param value Der Wert, der hineingespeichert werden soll.
	 * 
	 */
	public void addValue(double value) {
		values.add(value);
	}

	/**
	 * 
	 * Setzt die Zahl, mit der die Liste manipuliert wird.
	 * 
	 * @param modifier Die mitgegebene Zahl
	 * 
	 */
	public void setModifier(double modifier) {
		this.modifier = modifier;
	}
	
	/**
	 * 
	 * Implementiert zu Testzwecken, liefert den Modifier zurueck.
	 * 
	 * @return modifier Den Modifier-Wert
	 * 
	 */
	public double getModifier() {
		return modifier;
	}

	/**
	 * 
	 * Loescht einen Wert einen aus der Liste.
	 * 
	 * @param value Der Wert, der geloescht werden soll.
	 * 
	 */
	public void removeValue(double value) {
		values.remove(""+value);
	}

	/**
	 * 
	 * Fuehrt die Berechnung aus mit dem gewaehlten Vorzeichen.
	 * 
	 * @return Die Liste mit den ausgerechneten Werten.
	 * 
	 */
	public List<Double> processCalculations() {
		return operator.processCalculations(values, modifier);
	}

	/**
	 * 
	 * Gibt die Werte der Liste als String aus.
	 * 
	 * @param values Die Liste, die als Text ausgegeben werden soll.
	 * @return Die Werte als String.
	 * 
	 */
	public String toString(List<Double> values) {
		String out = "";
		Iterator<Double> in = values.iterator();
		while (in.hasNext()) {
			out = out + in.next() + "\n";
		}
		return out;
	}
	
	/**
	 * 
	 * Zu Testzwecken, gibt den Inhalt der 'values' aus.
	 * 
	 * @return values Die Werte der internen Liste.
	 * 
	 */
	public String toString() {
		String out = "";
		Iterator<Double> in = values.iterator();
		while (in.hasNext()) {
			out = out + in.next() + "\n";
		}
		return out;
	}
	
	/**
	 * 
	 * Setzt die Rechenoperation fest.
	 * 
	 * @param operator Die gewuenschte Rechenoperation in der Schreibweise 'new [Vorzeichen]()'.
	 * 
	 */
	public void setCalculation(Calculate operator) {
		this.operator = operator;
	}
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		
		test.addValue(1.1);
		test.addValue(44.3);
		
		test.setModifier(1.0);
		List<Double> ou = test.processCalculations();
		
		System.out.println(test.toString(ou));
	}
}
