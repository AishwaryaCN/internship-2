package DAY7;
import java.util.*;
public class AnagramDemo {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String str1,str2;
	System.out.println("enter the 2 strings");
	str1=sc.nextLine();
	str2=sc.nextLine();
 int str1len=str1.length();	
 int str2len=str2.length();
 if(str1len == str2len)
 {
	char[] ArrayS1 = str1.toCharArray();
	Arrays.sort(ArrayS1);
	char[] ArrayS2 = str2.toCharArray();
	Arrays.sort(ArrayS2);
	if(Arrays.equals(ArrayS1,ArrayS2))
	{
		System.out.println("given strings are anagram");
	}else
	{
		System.out.println("Given strings are not anagram");
	}
 }else
 {
	 System.out.println("error");
 }
}
}
