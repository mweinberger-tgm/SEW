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
	List<Double> out = new Vector<Double>();
	String sout;
	
	@Before
	public void prepare() {
		cal = new Calculator();
		
		cal.addValue(234.12);
		cal.addValue(2.4512);
		cal.addValue(234.123);
		cal.addValue(56.23);
		cal.addValue(42.0);
		
		cal.setModifier(1.0);
		
	}
	
	@Test
	public void testAddition() {
		out = cal.processCalculations();
		
		assertEquals("235.12\n3.4512\n235.123\n57.23\n43.0\n", cal.toString(out));
	}
	
	@Test
	public void testSubtraction() {
		cal.setCalculation(new Substraction());
		out = cal.processCalculations();
		
		assertEquals("233.12\n1.4512\n233.123\n55.23\n41.0\n", cal.toString(out));
	}
	
	@Test
	public void testMultiplication() {
		cal.setCalculation(new Multiplication());
		cal.setModifier(2);
		out = cal.processCalculations();
		
		assertEquals("468.24\n4.9024\n468.246\n112.46\n84.0\n", cal.toString(out));
	}
	
	@Test
	public void testDivision() {
		cal.setCalculation(new Division());
		cal.setModifier(2);
		out = cal.processCalculations();
		
		assertEquals("117.06\n1.2256\n117.0615\n28.115\n21.0\n", cal.toString(out));
	}
	
	@Test
	public void testGetModifier() {
		cal.setModifier(123.123);
		
		assertEquals(123.123, cal.getModifier(), 0);
	}
	
	@Test
	public void testRemoveValue() {
		cal.removeValue(42.0);
		out = cal.processCalculations();
		
		assertEquals("235.12\n3.4512\n235.123\n57.23\n", cal.toString(out));
	}
	
	@Test
	public void testSetValues() {
		List<Double> in = Arrays.asList(1.0, 2.0, 3.0);
		cal.setValues(in);
		out = cal.processCalculations();
		
		assertEquals("2.0\n3.0\n4.0\n", cal.toString(out));
	}
	
	@Test
	public void testGetValues() {
		out = cal.getValues();
		
		assertEquals("[234.12, 2.4512, 234.123, 56.23, 42.0]", out.toString());
	}
	
	@Test
	public void testToString() {
		assertEquals("234.12\n2.4512\n234.123\n56.23\n42.0\n", cal.toString());
	}
}
