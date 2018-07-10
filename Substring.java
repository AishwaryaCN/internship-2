import java.util.*;
public class Substring {
	public static void main(String []args ){
		String string,sub;
		int i,c,length;
		Scanner in= new Scanner (System.in);
System.out.println("enter the string");
string=in.nextLine();
length= string.length();
System.out.println("substrings of"+string+"are");
for(c=0;c<length;c++)
{
	for(i=1;i<=length-c;i++)
	{
sub=string.substring(c,c+i);
System.out.println(sub);
}
		
}}}
