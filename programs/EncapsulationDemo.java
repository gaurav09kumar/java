
class Encapsulation {
private int id;
private String name;
private float salary;


public void setDetails(int i,String n,float s)
	{
id=i;
name=n;
salary=s;
	}
public void display()
		{
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("salary="+salary);
		}
}
public class EncapsulationDemo{
	public static void main(String[] args){
		Encapsulation e1=new Encapsulation();
		e1.setDetails(1000,"ram",50000);
			e1.display();
			
		
	}
}

