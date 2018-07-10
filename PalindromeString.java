import java.util.*;
public	class PalindromeString
{
	   public static void main(String args[])
	   {
	      String orig, rev = ""; 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string ");
	      orig = in.nextLine();
	      int length = orig.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + orig.charAt(i);
	      if (orig.equals(rev))
	         System.out.println("palindrome.");
	      else
	         System.out.println("isn't a palindrome.");
	   }	}	
