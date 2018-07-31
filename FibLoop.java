package Day4;
import java.util.*;
public class FibLoop {

    public static void main(String[] args) {
    	Scanner in= new Scanner(System.in);
    	
        int count, n1 = 0, n2 = 1;
        System.out.println("enter the range");
        count=in.nextInt();
        
        System.out.println("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(n1+"\n ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
