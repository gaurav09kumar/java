package collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String args[]) {
		ArrayList a1=new ArrayList();
		a1.add("ABC");
		a1.add(100);
		a1.add(50);
		a1.add(400.67f);
		a1.add(600.67);
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("XYZ");
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		System.out.println();
		System.out.println(a1.size());
		System.out.println();
		System.out.println(a2.size());
		System.out.println();
		System.out.println(a1.contains("200"));
		Object a[]= a1.toArray();
		System.out.println();
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for(Object b:a) {
			System.out.println(b);
		}
		}
}
