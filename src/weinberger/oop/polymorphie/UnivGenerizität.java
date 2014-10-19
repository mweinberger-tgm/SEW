package weinberger.oop.polymorphie;

/**
 * 
 * @author Michael Weinberger 4AHITT
 *
 * @param <T>
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