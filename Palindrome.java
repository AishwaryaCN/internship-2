import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {

        int num, rInt = 0, rem, oint;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input a number");      
        num = in.nextInt();
        oint = num;
        while( num != 0 )
        {
            rem = num % 10;
            rInt = rInt * 10 + rem;
            num=num/10;
            
        } if (oint == rInt)
            System.out.println(oint + " is a palindrome.");
        else
            System.out.println(oint + " is not a palindrome.");
    }
}