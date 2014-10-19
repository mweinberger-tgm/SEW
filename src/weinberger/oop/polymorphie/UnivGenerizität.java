package weinberger.oop.polymorphie;

/**
 * 
 * @author Michael Weinberger 4AHITT
 *
 * @param <T>
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