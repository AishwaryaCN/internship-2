import java.util.Scanner;
public class CompareStrings
{
	public static void main(String []args ){
		String s1,s2;
		Scanner in= new Scanner(System.in);
		//in.close();
		System.out.println("enter the string 1");
		s1=in.nextLine();
		System.out.println("enter the string 2");
		s2=in.nextLine();
		if(s1.compareTo(s2)>0)
			System.out.println(" the string 1 is large");
		else if(s1.compareTo(s2)<0)

			System.out.println(" the string 2 is large");
		else

			System.out.println(" the strings are equal");
	}

}
