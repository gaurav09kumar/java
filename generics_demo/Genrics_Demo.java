package genericsdemos;
import java.util.*;
public class Genrics_Demo {
	public static void main(String[] args) {
		List <Integer> myList=new LinkedList<Integer>();
		myList.add(0);
		Integer x=myList.iterator().next();
		System.out.println(x);
	}
}
