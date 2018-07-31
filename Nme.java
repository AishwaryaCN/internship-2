package Day8;
import java.util.*;
import java.io.*;
public class Nme {
	public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Name: ");
    String Name = in.nextLine();
    System.out.print("Gender: ");
    String Gender = in.nextLine();
    in.close();
    try 
            {

        List<String> found = find(Name, Gender);
        if(!found.equals("")){
            System.out.println(found);
            } else{
            System.out.println( Name + " not found.");
        }

    } catch (Exception e){
		  System.err.println("Error: " + e.getMessage());
		  }
	}

private static List<String> find(String name, String gender) throws Exception{
	File names=new File("D://names.txt");
    Scanner sc= new Scanner(names);
   
	 List<String> nameList = Arrays.asList(sc.nextLine());
	  for(int i=0; i<2000;i++) {
	 String[] get = sc.nextLine().split(",");	
	
        if(name==(get[0].substring(0)) && gender==(get[0].substring(0))){
            return nameList;
        }
		return nameList;
    
}
	return null;
}
}
