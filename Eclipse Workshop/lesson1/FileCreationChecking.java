package lesson1;

import java.io.File;
import java.io.IOException;

public class FileCreationChecking {
	
	public static void main(String[]agrs) {
	
		try {
			
			File f1= new File("E:\\javaFileOutput\\FileChecing.txt");
			if (f1.createNewFile()) {
			
				System.out.println("File is created : "+f1.getName());
			}
			else{
				System.out.println("File is already created :" +f1.getName());
			}
		}catch(IOException e){
			System.out.println("An Error is occurred");
			System.out.println(e);
		}
	}
}
