package ap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	        {
			 Connection myconn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ap?useSSL=false","root","12345");
	        	Statement mystmt1=myconn.createStatement();
	        	ResultSet myRs1=mystmt1.executeQuery("select * from tyres");
	        	for(int i=1;i<=10211;i++) {
	        	if(myRs1.next()) {
		    		String id1=myRs1.getString("Timing");
		    		int id2=myRs1.getInt("Price");
		    		int id3=myRs1.getInt("QUANTITY");
		    		System.out.println(id1+" "+id2+" "+id3);}
		    		}}
		 catch(Exception exc) {
	    		exc.printStackTrace();
	    	}
	
	}

}
