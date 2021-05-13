package lesson1;

class Myclass1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread 1");
	}
}
class Myclass2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread 2");
		
	}
}

public class lesson2 {

	public static void main(String[] args) {
		
		Myclass1 myclass1 = new Myclass1();
		Thread t1 = new Thread(myclass1);
		
		Myclass2 myclass2 = new Myclass2();
		Thread t2 = new Thread(myclass2);
		t1.start();
		t2.start();
			
	}

}
