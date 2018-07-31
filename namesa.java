package unk;

import java.util.Scanner;

public class namesa {


public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	
	System.out.print("Enter how many friends: ");
	int n = Integer.parseInt(scan.nextLine());

	
	String name[] = new String[n];
	for (int i = 0; i < name.length; i++) {
		System.out.print("Enter the name" + (i+1) + " : ");
	        name[i] = scan.nextLine();
	}
	for (int i = 0; i < name.length; i++) {
		System.out.print("name" + (i+1) + " : ");
	        System.out.println(name[i] + "\n");
	}
	  
}}