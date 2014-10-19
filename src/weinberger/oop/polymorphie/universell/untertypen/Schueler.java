package weinberger.oop.polymorphie.universell.untertypen;

/**
 * Die Deklaration eines Typs T legt fest, welche direkten Supertypen T hat.
 * Bei einer Schnittstellendeklaration T gilt Folgendes:
 * 	•	Ohne extends-Klausel ist Object der einzige Supertyp.
 * 	•	Andernfalls sind die in der extends-Klausel genannten Schnittstellentypen die Supertypen.
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 *
 */
public class Schueler implements Person { //Es ist gegeben, dass ein Schueler alle Vorgaben fuer eine Person erfuellt. Person --> Supertyp 
	public void id() {
		//Do something
	}
}
