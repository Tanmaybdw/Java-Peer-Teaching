package lesson1;

import java.io.*;

public class FileCharacter {

	public static void main(String[] args) {
		FileWriter out = null;
		try
		{
			out = new FileWriter("E:\\javaFileOutput\\Char.txt");
			out.write("Welcome to GHRCEM wagholi");
			System.out.println("Successful !!!");
			out.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
