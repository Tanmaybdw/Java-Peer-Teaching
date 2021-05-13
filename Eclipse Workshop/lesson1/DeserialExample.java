package lesson1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee obj1=null;
		File f = new File("E:\\javaFileOutput\\Obj.txt");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj1 = (Employee) ois.readObject();
		ois.close();
		}
		finally {	
		System.out.println("-----Value of New Object are----");
		System.out.println("Name : "+ obj1.name);
		System.out.println("ID : " + obj1.id);
		}
	}
}
