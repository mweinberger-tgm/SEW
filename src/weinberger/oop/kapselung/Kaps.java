package weinberger.oop.kapselung;

import weinberger.oop.kapselung.Konto;

/**
 * The physical location of features (properties, behaviors) into a single black box abstraction that hides their implementation behind a public interface.
 * (Daten-) Kapselung ist auch bekannt unter dem Namen �data hiding� oder auch Geheimnisprinzip, und erm�glicht Daten oder Informationen vor dem Zugriff von au�en zu sch�tzen. 
 * Die direkte Kommunikation erfolgt �ber eine genau festgelegte Anwendungsschnittstelle, und kann daher als �Black Box� bezeichnet werden.
 * 
 * Durch die Access Modifier 
 *	�	+ / public, von �berall aus zugreifbar (auch andere Klassen)
 *	�	- / private, kann nur von der eigenen Klasse aus verwendet werden
 *	�	# / protected, f�r Subklassen
 *	�	~ / default (od. no modifier) kann nur aus dem eigenen Package zugegriffen werden
 *
 *	Das Prinzip des Information Hiding besagt, dass �
 *	Anwendern nur die Informationen zur Verf�gung stehen sollen, die zur Anwendungsschnittstelle geh�ren, sodass alle anderen Informationen f�r ihn verborgen und nicht zugreifbar sind.
 *
 *	Dies hat folgende Gr�nde:
 *	�	Vermeiden unsachgem��er Anwendung durch den User/Manipulation
 *	�	Reduktion der Abh�ngigkeiten in der Software
 *	�	Austausch von Teilen der Implementierung
 *
 *	Einfaches Beispiel:
 *	In den unteren Jahrg�ngen in Softwareentwicklung wurde uns diese Herangehensweise mithilfe einer Kokosnuss erkl�rt, 
 *	ohne die richtigen Werkzeuge (hier: Parameter) gibt es keinen Weg ins Innere, wo die leckere Kokosmilch (hier: Variablen, Informationen, Daten) verborgen ist.

 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public class Kaps {
	
	public static void main(String[] args) {
		Konto k = new Konto(255.0);
		//Ausschlie�licher Zugriff ueber Getter/Setter-Methoden
		
		k.setKontostand(256.0);
		
		System.out.println(k.getKontostand());
	}
}
