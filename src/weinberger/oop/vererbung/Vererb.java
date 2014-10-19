package weinberger.oop.vererbung;

/**
 * Die Vererbung (inheritance) in der objektorientierten Programmierung erm�glicht es, neue Klassen aus bereits existierenden Klassen abzuleiten.
 * Einige wichtige Stichworte:
 *  �	Inheritance (die Vererbung)
 *  �	derived class (die abgeleitete Klasse)
 *  �	base class (Basisklasse)
 *  �	subclass (Unterklasse)
 *  �	superclass (Oberklasse)
 *
 * Bei einer abgeleiteten Klasse, die dank der Vererbung alle Funktionen ihres sogenannten Elternteils hat ohne Manipulation der Implementierung, m�ssen nur Funktionen hinzugef�gt werden um diese Klasse zus�tzlich zu erweitern, jedoch k�nnen auch geerbte Methoden �berschrieben werden.
 * Ein �Elternobjekt� beschreibt, wenn auch unvollst�ndig, prinzipiell das Verhalten seiner �Kinder�.
 * Vererbung spart vor allem eines: Schreibaufwand, sprich redundanten Code
 * 
 * Au�erdem wird ein sp�teres Nachbessern im Code des Elternteils vereinfacht, weil der ge�nderte Code sich somit auf alle geerbten Klassen auswirken kann. 
 * Wie oben erw�hnt, gibt es zwei M�glichkeiten, um ein �Kind� einer Klasse zu erweitern, hier n�her beschrieben:
 * 
 * 	Erweitern:
 *	Erweitert die Oberklasse um neue Variablen, Methoden sowie Konstruktoren.
 *
 *	�berschreiben:
 * 	Methoden der Oberklasse werden durch neue Methoden �berschrieben, die diejenige dann ersetzen. Meist gibt es zus�tzlich eine Routine, auf die Ursprungs-Klasse der Oberklasse zuzugreifen.
 * 
 * Diese M�glichkeiten sind beliebig kombinierbar.
 * In Java l�sst sich mit dem Ausdruck �extends Klassenname� verwirklichen, es kann immer nur von einer einzelnen Klasse geerbt werden.
 *
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public class Vererb extends Parent {
	@Override
	public void ueberschreiben() {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		Vererb v = new Vererb();
		
		v.verwenden();
		v.ueberschreiben();
	}
}
