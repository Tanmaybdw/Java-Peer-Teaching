package lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{
		File f1 = new File("E:\\javaFileOutput\\WriterExe1.txt");
		Scanner sc = new Scanner(f1);
		
		while (sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}
		System.out.println("------------------------------");
		System.out.println("Read Finished!!!");
		sc.close();
		}catch(FileNotFoundException e){
			System.out.println("An Error is occured : "+e);
		}
	}
}
