

import java.util.*;
public class Datatype {
	public  static void main(String[] args) {
System.out.println("enter the number");
Scanner input=new Scanner(System.in);
	int n=Integer.parseInt(input.nextLine());
//	float x=Float.parseFloat(input.nextLine());
input.close();
if(n<2147483647 && n>-2147483648)
{
System.out.println("Can be fit in integer");	
}
if(n<127 && n>-128)
{
System.out.println("Can be fit in byte");	
}
if(n<Long.MAX_VALUE && n>Long.MIN_VALUE)
{
System.out.println("Can be fit in Long");	
}
/*if(x<Float.MAX_VALUE && x>Float.MIN_VALUE ) 
{
System.out.println("Can be fit in float");	
}*/

if(n<32768 && n>-32768)
{
System.out.println("Can be fit in short");	
}
}
	}

