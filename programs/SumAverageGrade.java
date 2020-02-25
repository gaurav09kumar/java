
public class SumAverageGrade {


	public static void main(String[] args) {
		int english,telugu,maths,social,hindi,biology,sum;
		english=Integer.parseInt(args[0]);
		telugu=Integer.parseInt(args[1]);
		maths=Integer.parseInt(args[2]);
		social=Integer.parseInt(args[3]);
		hindi=Integer.parseInt(args[4]);
		biology=Integer.parseInt(args[5]);
		sum=english+telugu+maths+social+hindi+biology;
		System.out.println("total marks of all the subjects= "+sum);
		float average =(float)(sum)/6; 
		System.out.println("average of all the marks ="+average);
		if (average>70)
		{
			System.out.println("A Grade");
		}
		else if (average<70 && average>=60)
		{
			System.out.println("Fist Class");
		}
		else if (average<60 && average>=50)
		{
			System.out.println("Second Class");
		}
		else if (average<50 && average>=35)
		{
			System.out.println("Third Class");
		}
		else 
		{
			System.out.println("fail");
		}

	}

}
