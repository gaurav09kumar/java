package newpack;
import java.util.*;

public class Example<T> {
	private T t;
	ArrayList <T>al=new ArrayList<>();

	public T getT() {
		return t;
	}

	public void setT(T t) {
		al.add(t);
		this.t = t;
		
	}
	public static void main(String[] args) {
		newexample object =new newexample();
		Example<String>obj1=new Example<>();
		Example<Integer>obj2=new Example<>();
		Example<Double>obj3=new Example<>();
		Example<?> object1=new Example<>();
		object.setA("Hello");
		object.setB(125);
		object.setA("Dev");
		object.setD(45000);
		obj1.setT(object.getA());
		obj2.setT(object.getB());
		obj1.setT(object.getA());
		obj3.setT(object.getD());
		Iterator<?> itr =object1.al.iterator() ;
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
