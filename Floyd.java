package DAY7;

public class Floyd {
	public static void main(String args[]) {
		int m,j,i;
		for(m=2; m<=6; m++)
		{
		for(j=7; j>=m; j--)
		{
		System.out.print(" ");
		}
		for(i=1; i<=(m-1); i++)
		{
		System.out.print("*");
		}
		System.out.println("");

}
}}