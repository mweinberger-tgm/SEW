package weinberger.s03_calculator;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;

/**
 * 
 * Ueberprueft die Implementierung der Aufgabe S03 auf Funktion.
 * 
 * Grundfunktionen:
 * 		Addieren
 * 		Subtrahieren
 * 		Multiplizieren
 * 		Dividieren
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-11-12
 *
 */
public class TestS03 {
	Calculator cal;
	List<Double> out;
	String sout;
	
	@Before
	public void prepare() {
		Calculator cal = new Calculator();
		
		cal.addValue(234.12);
		cal.addValue(1.89);
		cal.addValue(234.123);
		cal.addValue(56.23);
		cal.addValue(42.0);
		
		cal.setModifier(1.0);
	}
	
	@Test
	public void testAddition() {
		out = cal.processCalculations();
		sout = cal.toString(out);
		
		assertEquals("235.12\n2.89\n235.123\n57.23\n43.0", sout);
	}
}
