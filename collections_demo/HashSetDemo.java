package collectionsdemo;
import java.util.*;
public class HashSetDemo {
	public static void main(String args[]) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("10");
		hs.add(10);
		hs.add("XYZ");
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
}
