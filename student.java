package DAY7;
import java.util.*;
import java.io.*;
public class student{
	public static void main(String[]args) throws Exception {
		int sum=0;int largest;
		String gold="";
		try {
		FileInputStream fstream = new FileInputStream("D://marks.txt");
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	ArrayList<String>  studentList= new ArrayList<String>();
	ArrayList<Integer>  totalMarkList= new ArrayList<Integer>();
	  for(int i=0; i<26;i++) { 
	  List<String> students = Arrays.asList(br.readLine().split(","));	 
		int english=Integer.parseInt(students.get(3).substring(8));
		int maths=Integer.parseInt(students.get(4).substring(6));
		int physics=Integer.parseInt(students.get(5).substring(8));
		int chemistry=Integer.parseInt(students.get(6).substring(10));
		int biology=Integer.parseInt(students.get(7).substring(8));
		String name=students.get(0);
         studentList.add(i,name);
         sum=english+maths+physics+chemistry+biology;
         totalMarkList.add(i,sum);
         System.out.println("sum is:"+sum);
	  } 
	  largest=0;
	  for(int i=0;i<totalMarkList.size();i++) {
		  int sum1=totalMarkList.get(i);
      if(largest<sum1) {
    	  largest=sum1;
    	 gold= studentList.get(i);
      }
	  } 
System.out.println("largest is: " +largest);
	System.out.println("champion is: " +gold);
	    }	
	catch (Exception e){
		  System.err.println("Error: " + e.getMessage());
		  }
		  }
}