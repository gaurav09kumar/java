package learning;
class Employee{
	int id;
	String name;
	Employee(){
		this.id=100;
		this.name="XYZ";
	}
}
public class No_ArgConstructor {
	public static void main(String[]args) {
	Employee e1=new Employee();
		System.out.println("id:"+e1.id);
		System.out.println("name:"+e1.name);
		
	}
}
