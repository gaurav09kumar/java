package collectionsdemo;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		List l1=new LinkedList();
		l1.add("ABC");
		l1.add("XYZ");
		l1.add(10);
		l1.add(1);
		System.out.println(l1.size());
		System.out.println();
		for(Object b:l1)
		{
			System.out.println(b);
		}
	}
}
