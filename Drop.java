package unk;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Drop {
	 
	public static void main(String args[])  
	    {  
	    JFrame f= new JFrame("TextField");  
	    JTextField place = new JTextField(10);{
	    ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("heritage");
        words.add("happiness");
        words.add("goodbye");
        words.add("cruel");
        words.add("car");
        words.add("war");
        words.add("will");
        words.add("world");
        words.add("wall");
        words.add("mango");
        words.add("man");
        words.add("manga");
        setDictionary(words);
        
	    place.setBounds(90,110,200,100);  
	    f.add(place);  
	    f.setSize(400,300);  

	    f.setLayout(null);  
	    f.setVisible(true);  
	    }  
}

	private static void setDictionary(ArrayList<String> words) {
		
		        
				
	}
		// TODO Auto-generated method stub
		
	}
