package unk;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class v {

 
public static void main(String args[])  
    {  
    JFrame f= new JFrame("TextField");  
    JTextArea place=new JTextArea("");  
    place.setBounds(90,110,200,100);  
    f.add(place);  
    f.setSize(400,300);  

    f.setLayout(null);  
    f.setVisible(true);  
    }  
}  