package Day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AvgMarks {
	public static void main(String args[])throws Exception
	{
		File ftable= new File("D://i.txt");
		int sum=0,n,m,count=10;
		float avg=0;
		PrintStream ftable1= new PrintStream(new FileOutputStream("D://out.txt"));
		System.setOut(ftable1);
		Scanner s= new Scanner(ftable);
		Scanner in= new Scanner(System.in);
		//System.out.println(" enter no of input");
		//int count= in.nextInt();
		
		System.out.println(" the numbers are taken from the file");
		for(int i=1;i<count;i++) 
		{
			m=s.nextInt();
		
			sum=sum+m;
	        avg=sum/count;
		}
		System.out.println("sum of 1st 10 score is\t"+sum);		 
System.out.println("avg of score is\t"+avg);
}
}
