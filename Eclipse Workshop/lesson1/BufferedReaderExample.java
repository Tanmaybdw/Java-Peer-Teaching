package lesson1;

import java.io.*;  
public class BufferedReaderExample{    
public static void main(String args[])throws Exception{    
	
    InputStreamReader r=new InputStreamReader(System.in);    
   
    BufferedReader br=new BufferedReader(r);            
    
    System.out.println("Enter your name");    
    
    String name=br.readLine();    //read entire line
    
    System.out.println("Welcome "+name);    
}    
}  