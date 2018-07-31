package day5;
import java.util.*;

import java.util.*;
public class Prison {
	
public static void main(String [] args) {
	int count=0;
	boolean [] bool= new boolean[101];
	Arrays.fill(bool, false);
	
	for(int i=1;i<bool.length;i++)
	{
		for(int k=i;k<bool.length;k+=i) {
		if(!bool[k]) {
			bool[k]=true;}
			else 
				bool[k]=false;
		}}
		for(int i=1;i<bool.length;i++)
			
		{
			if(bool[i])
			{
			System.out.println("prison id " +i+ " released");
			count++;
			}
	
		}
	
		System.out.println("total release = " +count);
		
				}}




