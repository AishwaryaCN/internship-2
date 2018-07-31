package unk;
import java.awt.Button;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

//import javax.swing.JTextField;
public class Read {
	public static void main(String args[]) throws Exception
	{	
	        File f = new File("D://out2.txt");
	        FileOutputStream out = new FileOutputStream(f);
	        PrintWriter pw = new PrintWriter(out);
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter a text: ");
	        String str = br.readLine();
	        pw.write(str);
	        pw.flush();
	        out.close();
	        pw.close();
}}