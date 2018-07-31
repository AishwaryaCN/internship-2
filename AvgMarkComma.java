package Day4;
import java.util.*;
import java.io.*;
public class AvgMarkComma {
public static void main(String[]args) throws Exception {
	int sum=0;
	int avg=0;
	String space = "   ";
	File fileIn=new File("D://i.txt");
	File fileOut = new File("D://out1.txt");
	Scanner in= new Scanner(fileIn);
	String [] temp =in.nextLine().split(",");
	for(int i=0;i<5; i++) {
		sum=sum+Integer.parseInt(temp[i]);
	}
	    avg=sum/5;
	System.out.println("sum is:"+sum  + "\naverage is:"+avg);
	FileWriter fw = new FileWriter(fileOut);
	fw.write(Integer.toString(sum));
	fw.write(space);
	fw.write(Integer.toString(avg));
	fw.close();
}
}

