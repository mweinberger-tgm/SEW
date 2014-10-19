package weinberger.oop.polymorphie.universell.generizitaet;

/**
 * Generische Klassen, Typen und Routinen enthalten Typparameter,  f�r die Typen eingesetzt werden.
 * Auch parametrisierte Polymorphie genannt, eine Methode soll dynamisch f�r Daten verschiedener Typen einsetzbar sein.
 * Durch formale Typparameter kann diese Vielgestaltigkeit erreicht werden.
 * Dieser Typparameter wird in spitzen Klammern <T> geschrieben. 
 * Bei der Erstellung von Objekten muss dann ein definierter (Daten-) Typ bekannt gemacht werden, auf diese Weise muss dieser nicht statisch gebunden sein.
 * Die Generizit�t gibt es erst seit Java 1.5
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 * 
 * @param <T> Der Typparameter, wo im Laufe des Programms ein Wert eingesetzt wird.
 */
public class UnivGenerizit�t<T>  {  
	private T value;    
	public UnivGenerizit�t(T t){   
		this.value=t;  
	}  
	public T getValue() {  
		return value;  
	}  
	public void setValue(T value) {
		this.value = value;  
	} 
	@Override  
	public String toString(){ 
		return ""+getValue(); 
	} 
	public static void main(String[] a){
		UnivGenerizit�t<String> s=new UnivGenerizit�t<String>("1"); 
		System.out.println(s.toString());
		UnivGenerizit�t<Integer> i=new UnivGenerizit�t<>(2); 
		System.out.println(i.toString()); 
		UnivGenerizit�t<Double> d=new UnivGenerizit�t<>(3.6);
		System.out.println(d.toString()); 
		d.setValue(4.4);
		System.out.println(d.toString());
		}
	}