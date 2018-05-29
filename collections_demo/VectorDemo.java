package collectionsdemo;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
Vector v=new Vector();
v.add("abc");
v.add(1000);
v.add(525);
v.add("xyz");
System.out.println(v);
System.out.println();
System.out.println(v.contains(525));
System.out.println();
System.out.println(v.firstElement());
System.out.println();
System.out.println(v.get(1));
System.out.println();
System.out.println(v.isEmpty());
System.out.println();
System.out.println(v.remove(1));
System.out.println(v);
System.out.println();
System.out.println(v.size());
System.out.println();
Iterator itr=v.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
v.clear();
System.out.println("v is"+v);
}
}