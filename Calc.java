package Day3;
import java.io.File;
import java.util.*;
public class Calc {
    public static void main(String args[])throws Exception
    {File ftable= new File("D://in.txt");

        int a, b, res;
        int choice;
       
		
		Scanner s= new Scanner(ftable);
		Scanner in= new Scanner(System.in);
	
            System.out.print("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = in.nextInt();
            switch(choice)
            {
                case 1 : System.out.print("Enter Two Number : ");
                    a = s.nextInt();
                    b = s.nextInt();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;
                case 2 : System.out.print("Enter Two Number : ");
                    a = s.nextInt();
                    b = s.nextInt();
                    res = a - b;
                    System.out.print("Result = " + res);
                    break;
                case 3 : System.out.print("Enter Two Number : ");
                    a = s.nextInt();
                    b = s.nextInt();
                    res = a * b;
                    System.out.print("Result = " + res);
                    break;
                case 4 : System.out.print("Enter Two Number : ");
                    a = s.nextInt();
                    b = s.nextInt();
                    res = a / b;
                    System.out.print("Result = " + res);
                    break;
                case 5 : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
            
    }
}