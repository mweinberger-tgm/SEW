package weinberger.oop.kapselung;

public class Konto {
	private double kontostand;

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	public Konto(double wert) {
		this.kontostand = wert;
	}
}
