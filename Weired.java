
import java.util.Scanner;
public class Weired {
public static void main(String []args ){
 int number;
 Scanner in= new Scanner(System.in);
 in.close();
 System.out.println("Enter a number to check even or odd");
 number=in.nextInt();
 /*if((number % 2)==0)
 {	
 
 System.out.println(+number+" is Even number d");}*/

if((number % 2)!=0){
	
System.out.println(+number+" is weired");}


else if((number % 2)==0)
{
if(number>=2 && number<=5)
	System.out.println(+number+" is  number not weired");
else if(number>=6 &&number<=20)
	System.out.println(+number+" is  number  weired");
else if(number>20)
	System.out.println(+number+" is  number  weired");

}
}
}
	



 