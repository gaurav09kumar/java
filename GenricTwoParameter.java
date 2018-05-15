package genericsdemos;
class Student <U,V>{
	private U uref;
	private V vref;
	public U getUref() {
		return uref;
	}
	public void setUref(U uref) {
		this.uref = uref;
	}
	public V getVref() {
		return vref;
	}
	public void setVref(V vref) {
		this.vref = vref;
	}
	
}
public class GenricTwoParameter {
	public static void main(String [] args) {
		Student<Integer,String> student=new Student<Integer,String>();
		student.setUref(425);
		student.setVref("abc");
		System.out.println(student.getUref());
		System.out.println(student.getVref());
	}
}
