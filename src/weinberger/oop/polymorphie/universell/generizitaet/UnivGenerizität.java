package weinberger.oop.polymorphie.universell.generizitaet;

/**
 * Generische Klassen, Typen und Routinen enthalten Typparameter,  für die Typen eingesetzt werden.
 * Auch parametrisierte Polymorphie genannt, eine Methode soll dynamisch für Daten verschiedener Typen einsetzbar sein.
 * Durch formale Typparameter kann diese Vielgestaltigkeit erreicht werden.
 * Dieser Typparameter wird in spitzen Klammern <T> geschrieben. 
 * Bei der Erstellung von Objekten muss dann ein definierter (Daten-) Typ bekannt gemacht werden, auf diese Weise muss dieser nicht statisch gebunden sein.
 * Die Generizität gibt es erst seit Java 1.5
 * 
 * @author Michael Weinberger 4AHITT
 * @version 2014-10-12
 * 
 * @param <T> Der Typparameter, wo im Laufe des Programms ein Wert eingesetzt wird.
 */
public class UnivGenerizität<T>  {  
	private T value;    
	public UnivGenerizität(T t){   
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
		UnivGenerizität<String> s=new UnivGenerizität<String>("1"); 
		System.out.println(s.toString());
		UnivGenerizität<Integer> i=new UnivGenerizität<>(2); 
		System.out.println(i.toString()); 
		UnivGenerizität<Double> d=new UnivGenerizität<>(3.6);
		System.out.println(d.toString()); 
		d.setValue(4.4);
		System.out.println(d.toString());
		}
	}