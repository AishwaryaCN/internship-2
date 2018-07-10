package aishwarya;
import java.util.*;
import java.io.*;

public class tables {
	public static void main(String args[])throws Exception{
		
		PrintStream ftable1= new PrintStream(new FileOutputStream("D://out.txt"));
		System.setOut(ftable1);
		File ftable= new File("D://in.txt");
		
		Scanner sc= new Scanner(ftable);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int j=m;j<=n;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(m+"*"+i+"="+m*i);
			}
			m++;
			System.out.println();
			
		}
		
	}
	
	
}
