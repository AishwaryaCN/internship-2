package DAY7;
import java.util.*;
import java.io.*;

public class Baby {
	public static void main(String args[])throws Exception {
		Scanner in= new Scanner(System.in);
		File Names= new File("D://names.txt");
		Scanner sc= new Scanner(Names);
		System.out.println("enter the first letter");
		String a= in.nextLine();
		 for(int i=0; i<2000;i++) {
		 List<String> nameList = Arrays.asList(sc.nextLine().split(","));	 
		 String names=nameList.get(0);
		// 
		 
		// if(nameList.get(0)==a) {
			 //System.out.println(in.hasNext(a));
		
		// }
		 System.out.println(names);
       
		
		
		
}}}
