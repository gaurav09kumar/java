
public class Swap {
public static void main(String[] args){
	int a,b,c;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	System.out.println("previous value of a="+a);
	System.out.println("previous value of b="+b);
	c=a;
	a=b;
	b=c;
	System.out.println("new value="+a);
	System.out.println("new value="+b);
	
	
}
}
