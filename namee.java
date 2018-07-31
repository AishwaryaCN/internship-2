package Day8;

import java.io.File;
import java.util.Scanner;

public class namee {
	public static void main(String[] args){
		
		
		
	    Scanner in = new Scanner(System.in);
	    System.out.print("Name: ");
	    String  name = in.nextLine();
	    System.out.print("Gender: ");
	   String  gender = in.nextLine();
	    in.close();
		
	}
	    public String isName( String name,String gender) {
	        String name1 = null;
	        File Names= new File("D://names.txt");
			Scanner sc= new Scanner(Names);
	        for (int i=0;i<2000;i++) {
	            if (gender.equals(Names(get(1).substring (0))) {
	                 return gender.get(i);
	            }
	            if (gender.equals(Names.get(1)) && name.equals(Names.get(1))) {
	                return (Names.get(i));
	            }

	        }
	        return "NO Name";
	    }
		
}
