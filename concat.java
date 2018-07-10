import java.util.*;
public class concat {
	public static void main(String []args ){
		String s1,s2,s3;
		Scanner in= new Scanner(System.in);
		//in.close();
		System.out.println("enter the string 1");
		s1=in.nextLine();
		System.out.println("enter the string 2");
		s2=in.nextLine();
		concat obj= new concat();
		s3=obj.concat(s1,s2);
		System.out.println("new string is\n"+s3);
	}
	String concat(String x,  String y)
	{
		String z;
		z=x+""+y;
		return z;
	}
}
