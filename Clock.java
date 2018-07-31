package DAY7;

import java.util.*;
public class Clock {
	
		    public static void main(String[] args) {
		        for(int i = 9;i <=12;i++){
		            for(int j =0;j< 60;j=j+5) {
		                System.out.println("For " +i+":"+j+ " angle is: "+ Angle(i,j));
		            }
		        }
		        for(int i = 1;i < 9;i++){
		            for(int j = 0; j< 60;j=j+5){
		                System.out.println("For " +i+":"+j+ " angle is: "+ Angle(i,j));
		            }
		        }
		    }
		    public static double Angle(int h, int m) { 
		        double angle = 0.5 * ((60 * h) - (11 * m));
		        double angelAbs = Math.abs(angle);
		        if (angelAbs > 180) {
		            angelAbs = 360 - angelAbs;
		            return angelAbs;
		        }
		        return angelAbs;
		    }
	}
		  
	
	
	
  