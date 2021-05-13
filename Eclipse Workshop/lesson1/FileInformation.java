package lesson1;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1= new File("E:\\javaFileOutput\\FileChecing.txt");
		if (f1.exists()) {
		
			System.out.println("File name : " +f1.getName());
			System.out.println("Absolute Path : " +f1.getAbsolutePath());
			System.out.println("Writable : " +f1.canWrite());
			System.out.println("Readable : " +f1.canRead());
			System.out.println("File Size in bytes : " +f1.length());		
		}
		else
			System.out.println("THe file is not Exist");
		
	}

}
