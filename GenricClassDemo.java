package genericsdemos;
/*here the class ABC is of T type
 * add method takes parameter of T type
 * get method returns an object of T type
 * */
class ABC<T>{
	T obj;
	void add(T i) {
		this.obj=i;
	}
	T get()
	{
		return obj;
	}
}
public class GenricClassDemo {
	public static void main(String[] args) {
		 ABC<Integer> m=new ABC<Integer>();
		 m.add(2);
		 System.out.println(m.get());   
	}
}
