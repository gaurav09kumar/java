package collectionsdemo;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		//similar type of data can be added.
		//ts.add("xyz");
		ts.add(3);
		ts.add(9);
		ts.add(2);
		ts.add(2);
		//ts.add("ABC"); //error
		System.out.println(ts);
		//ascending to descending
		Iterator it= ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
