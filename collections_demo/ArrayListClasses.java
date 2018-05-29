package collectionsdemo;
import java.util.*;
class Student{
	int id;
	String name;
	Student(int i,String n){
		this.id=i;
		this.name=n;
	}
}
public class ArrayListClasses {
	public static void main(String [] args) {
		//creating user defined classes
		Student id1=new Student(405, "ABC");
		Student id2=new Student(500, "ZYX");
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(id1);
		a1.add(id2);
		
		Iterator itr=a1.iterator();
		//traversing elements of array list
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.id+" "+st.name);
		}
}
}
