package collectionsdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo2 {
	public static void main(String args[]) {
		//creating an array list
		//genric_way of declaring an array list
		ArrayList<String> a1=new ArrayList<String>(); 
		a1.add("name1");
		a1.add("name2");//adding object in array list
		a1.add("10");
		//two ways to iterate the elements in the array list
		//iterator method
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		//Iterating the elements of Collection by for-each loop 
		for(Object c:a1) {
			System.out.println(c);
		}
		System.out.println(a1.hashCode());
		}
}