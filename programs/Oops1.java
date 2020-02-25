class Employee
{
	int id;
	float salary;
	String name;
	long mobileNumber;
	
	void setDetails(int i,float s,String n,long mN )
	{
		id=i;
		salary=s;
		name=n;
		mobileNumber=mN;
	}
	void display()
	{
		System.out.println("id="+id);
		System.out.println("salary="+salary);
		System.out.println("name="+name);
		System.out.println("Mobile Number="+mobileNumber);

	}
	
}
public class Oops1 {



	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setDetails(456, 10000045.89f, "Assasin", 1234567890);
		e1.display();
		System.out.println("e1 identity="+e1);
		Employee e2=new Employee();
		e2.setDetails(567, 234567890.99f,"Hitman",1000967564);
		e2.display();
		System.out.println("e2 identity="+e2);

	}

}
