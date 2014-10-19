package weinberger.oop.abstraktion;

/**
 * Abstraktion ist ein theoretisches Konzept zur Beschreibung von Objekten und Klassen.
 * Weil ein Objekt sowohl Daten als auch Methoden beinhaltet, kann die Abstraktion sowohl die Daten selbst als auch deren Attribute konsistent behandeln. 
 * Die abstrakte Beschreibung von Objekten und Klassen dient im Wesentlichen zur begrifflichen Definition derselben.
 * 
 * Sprich, eine Klasse kann wie ein funktionserweitertes Interface sowohl vollständige Methoden als auch nur Signaturen dieser enthalten, also ohne eigentliche Implementierung. 
 * Abstrakte Klassen/Methoden sind quasi ein Zeichen, ‚dass hier eine Methode vorhanden ist, die es eigentlich nicht gibt‘.
 * Eine sinnvolle Einsetzung findet bei der Vererbung statt, wo diese mitvererbt und implementiert werden (können).
 * Man beachte, dass man abstrakte Klassen nicht ausführen kann.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public abstract class Abstr { 
	public abstract void methodeohneimpl();
	
	public void methodemitimpl() {
		System.out.println("Zwerg Bumsti");
	}
}

