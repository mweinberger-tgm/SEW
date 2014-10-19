package weinberger.oop.vererbung;

/**
 * Die Vererbung (inheritance) in der objektorientierten Programmierung ermöglicht es, neue Klassen aus bereits existierenden Klassen abzuleiten.
 * Einige wichtige Stichworte:
 *  •	Inheritance (die Vererbung)
 *  •	derived class (die abgeleitete Klasse)
 *  •	base class (Basisklasse)
 *  •	subclass (Unterklasse)
 *  •	superclass (Oberklasse)
 *
 * Bei einer abgeleiteten Klasse, die dank der Vererbung alle Funktionen ihres sogenannten Elternteils hat ohne Manipulation der Implementierung, müssen nur Funktionen hinzugefügt werden um diese Klasse zusätzlich zu erweitern, jedoch können auch geerbte Methoden überschrieben werden.
 * Ein ‚Elternobjekt‘ beschreibt, wenn auch unvollständig, prinzipiell das Verhalten seiner ‚Kinder‘.
 * Vererbung spart vor allem eines: Schreibaufwand, sprich redundanten Code
 * 
 * Außerdem wird ein späteres Nachbessern im Code des Elternteils vereinfacht, weil der geänderte Code sich somit auf alle geerbten Klassen auswirken kann. 
 * Wie oben erwähnt, gibt es zwei Möglichkeiten, um ein ‚Kind‘ einer Klasse zu erweitern, hier näher beschrieben:
 * 
 * 	Erweitern:
 *	Erweitert die Oberklasse um neue Variablen, Methoden sowie Konstruktoren.
 *
 *	Überschreiben:
 * 	Methoden der Oberklasse werden durch neue Methoden überschrieben, die diejenige dann ersetzen. Meist gibt es zusätzlich eine Routine, auf die Ursprungs-Klasse der Oberklasse zuzugreifen.
 * 
 * Diese Möglichkeiten sind beliebig kombinierbar.
 * In Java lässt sich mit dem Ausdruck ‚extends Klassenname‘ verwirklichen, es kann immer nur von einer einzelnen Klasse geerbt werden.
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
