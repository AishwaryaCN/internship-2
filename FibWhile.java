package Day4;
import java.io.*;
import java.util.*;
public class FibWhile {
    public static void main(String[] args)throws Exception {
File ftable= new File("D:\\in.txt");
Scanner in= new Scanner(ftable);
System.out.println(" enter the range");
int count=in.nextInt();
        int  n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(n1+" ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}