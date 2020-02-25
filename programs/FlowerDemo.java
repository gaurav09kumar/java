class Flower
{
	int numberOfFlowers;
	int variety;
	String nameOfTheFlower;
	
	void display()
	{
		System.out.println("Number Of Flower="+numberOfFlowers);
		System.out.println("variety="+variety);
		System.out.println("Name Of The Flower="+nameOfTheFlower);
	}
	
	void setDetails(int f,int v,String n)
	{
		numberOfFlowers=f;
		variety=v;
		nameOfTheFlower=n;
		
	}
	
}
public class FlowerDemo {

	
	public static void main(String[] args) {
		Flower f1=new Flower();
		f1.setDetails(109, 1, "Rose");
		f1.display();
		System.out.println("f1 Identity="+f1);
		
		Flower f2=new Flower();
		f2.setDetails(111, 1, "Lotus");
		f2.display();
		System.out.println("f2 Identity="+f2);
		
		Flower f3=new Flower();
		f3.setDetails(119, 1, "Liril");
		f3.display();
	}

}
