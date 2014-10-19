package weinberger.oop.polymorphie.adhoc.ueberladen;

import weinberger.oop.polymorphie.adhoc.typanpassung.Luftfahrzeug;

/**
 * Von Überladung sprechen wir, wenn der Aufruf einer Operation anhand des konkreten Typs von Variablen oder Konstanten auf eine Methode abgebildet wird. Im Gegensatz zur dynamischen Polymorphie spielen die Inhalte der Variablen bei der Entscheidung, welche konkrete Methode aufgerufen wird, keine Rolle.
 * So kann der Methodenname gleich sein, wodurch nur nach Parametern (unterschiedliche Anzahl, unterschiedliche Typen) unterschieden wird. 
 * Überladung kann nur von Sprachen mit statischem Typsystem unterstützt werden.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public class Ueber extends Luftfahrzeug {
	public static void main(String[] args) {
		Ueber flugzeug = new Ueber();
		
		flugzeug.flieg();
		flugzeug.flieg(true);
		flugzeug.flieg(100.0);
	}
}
