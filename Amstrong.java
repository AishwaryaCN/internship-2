
import java.util.Scanner;
public class Amstrong
{
   public static void main(String args[])
   {
      int n, sum = 0, temp, r, digits = 0;
      Scanner in = new Scanner(System.in);
     // in.close();
      System.out.println("Input a number");      
      n = in.nextInt();
      temp = n;

      
      
      while (temp != 0) {
         digits++;
         temp= temp/10;
      }
   temp = n;
      while (temp != 0) {
         r = temp%10;
         sum = sum + power(r, digits);
         temp = temp/10;
      }
      if (n == sum)
         System.out.println(n +"is an Armstrong.");
      else
         System.out.println(n +"isn't  Armstrong.");         
   }
   static int power(int n, int r) {
      int c, p = 1;
      for (c = 1; c <= r; c++) 
         p = p*n;
      return p;   
   }
}