package Day3;
import java.util.*;
public class Fact{  
    public static void main(String args[]){  
     int i,fact=1,num;  
     System.out.println("enter the number");
     Scanner in= new Scanner(System.in);
     num=in.nextInt();
     
     for(i=1;i<=num;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+num+" is: "+fact);    
    }  
   }  