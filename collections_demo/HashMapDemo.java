package collectionsdemo;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer, String>();
		map.put(1, "XYZ");
		map.put(5, "abc");
		map.put(3, "uvw");
		map.put(4,null);
		System.out.println(map);
		System.out.println(map.get(3));//we can retrieve the value by a particular key
		
		
		//use Map.Entry for set and Iterator
		Set<Map.Entry<Integer, String>>set=map.entrySet();
		
		
		Iterator<Map.Entry<Integer, String>>itr=set.iterator();
		
		
		while(itr.hasNext()) {
			Map.Entry e=itr.next(); //no need of type casting
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
