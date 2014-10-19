package weinberger.oop.kapselung;

import weinberger.oop.kapselung.Konto;

/**
 * The physical location of features (properties, behaviors) into a single black box abstraction that hides their implementation behind a public interface.
 * (Daten-) Kapselung ist auch bekannt unter dem Namen ‚data hiding‘ oder auch Geheimnisprinzip, und ermöglicht Daten oder Informationen vor dem Zugriff von außen zu schützen. 
 * Die direkte Kommunikation erfolgt über eine genau festgelegte Anwendungsschnittstelle, und kann daher als ‚Black Box‘ bezeichnet werden.
 * 
 * Durch die Access Modifier 
 *	•	+ / public, von überall aus zugreifbar (auch andere Klassen)
 *	•	- / private, kann nur von der eigenen Klasse aus verwendet werden
 *	•	# / protected, für Subklassen
 *	•	~ / default (od. no modifier) kann nur aus dem eigenen Package zugegriffen werden
 *
 *	Das Prinzip des Information Hiding besagt, dass …
 *	Anwendern nur die Informationen zur Verfügung stehen sollen, die zur Anwendungsschnittstelle gehören, sodass alle anderen Informationen für ihn verborgen und nicht zugreifbar sind.
 *
 *	Dies hat folgende Gründe:
 *	•	Vermeiden unsachgemäßer Anwendung durch den User/Manipulation
 *	•	Reduktion der Abhängigkeiten in der Software
 *	•	Austausch von Teilen der Implementierung
 *
 *	Einfaches Beispiel:
 *	In den unteren Jahrgängen in Softwareentwicklung wurde uns diese Herangehensweise mithilfe einer Kokosnuss erklärt, 
 *	ohne die richtigen Werkzeuge (hier: Parameter) gibt es keinen Weg ins Innere, wo die leckere Kokosmilch (hier: Variablen, Informationen, Daten) verborgen ist.

 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public class Kaps {
	
	public static void main(String[] args) {
		Konto k = new Konto(255.0);
		//Ausschließlicher Zugriff ueber Getter/Setter-Methoden
		
		k.setKontostand(256.0);
		
		System.out.println(k.getKontostand());
	}
}
