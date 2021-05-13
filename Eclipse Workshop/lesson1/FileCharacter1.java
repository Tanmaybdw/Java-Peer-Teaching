package lesson1;

import java.io.FileReader;
import java.io.IOException;

public class FileCharacter1 {

	public static void main(String[] args) {
		FileReader in = null;
		try
		{
			in=new FileReader("E:\\javaFileOutput\\input.txt");
			int i=0;
			while((i=in.read()) != -1)
			{
				System.out.print((char)i);
			}
			in.close();
		}
		catch(IOException e)
		{System.out.println(e);}
	}
}
