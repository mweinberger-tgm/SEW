package weinberger.oop.polymorphie.adhoc.typanpassung;

/**
 * Wieder verwendet man denselben Namen für unterschiedliche Objekte, 
 * jedoch wird das Objekt durch automatische Typanpassungen an den erforderlichen Argumenttyp einer Funktion angeglichen.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 * 
 */
public class Flugzeug extends Luftfahrzeug{
	Flugzeug airbus = new Flugzeug();
	Luftfahrzeug flgzg = airbus;
	
	//Basisklassenreferenz = Subklassenreferenz
}
