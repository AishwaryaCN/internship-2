package DAY7;
import java.util.*;
public class Multhiples {
	public static void main(String args[])
	{
	Multhiples m1= new Multhiples();
		Scanner in= new Scanner(System.in);
		System.out.println("enter the input 1");
		int i1=in.nextInt();
		System.out.println("enter the input 2");
		int i2=in.nextInt();
			
		
int sum=m1.mul( i1, i2);
		System.out.println(sum);
}

	public int mul(int i1,int i2) {

		int sum=0, m=10;;
		for(int i=0;i<m;i++) {
			if(i%i1==0||i%i2==0) {
			sum=sum+i;
			System.out.println("multiples of input 1 are\n"+i);
			System.out.println("multiples of input 2 are"+i);
			
		
		
	}
	
	}return sum;}}
