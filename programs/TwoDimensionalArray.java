
public class TwoDimensionalArray {

	
	public static void main(String[] args) {
		int s[][]={{1,2,3},{4,5,6}};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<=s.length;j++)
				
			{
				
			
				 System.out.println(s[i][j]+" ");
			        if(s[i][j]==2)
			        {
			        	s[i][j]==0;
			        }
			}
  
        }

	}

}
/*int i,j,k=1;

for(i=0;i<7;i++){
    for(j=0;j<5;j++) {
     twoDm[i][j]=k;
        k++;}
}

for(i=0;i<7;i++){
    for(j=0;j<5;j++) {
        System.out.print(twoDm[i][j]+" ");
        System.out.print("");}
}*/