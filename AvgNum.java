package Day3;
import java.io.File;
import java.util.*;
public class AvgNum {
	public static void main(String args[])throws Exception
	{
		File ftable= new File("D://in.txt");
		int sum=0,n,m;
	float avg=0;
		Scanner s= new Scanner(ftable);
		//s.close();
		
		Scanner in= new Scanner(System.in);
//in.close();
		System.out.println(" enter no of input");
		int count= in.nextInt();
		System.out.println(" enter the numbers");
		for(int i=1;i<=count;i++) 
		
		
		{
			m=s.nextInt();
		
			sum=sum+m;
	        avg=sum/count;
		
		}  System.out.println("Sum of Digits:"+sum);
		
		 System.out.println("Avg of Digits:"+avg);
	}
}


		


