package lesson1;

class Myclass3 implements Runnable
{
	public void run()
	{
		System.out.println("Thread 1");
		System.out.println("Thread 1");
		System.out.println("Thread 1");
		System.out.println("Thread 1");
		System.out.println("Thread 1");
	}
}
class Myclass2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread 2");
		System.out.println("Thread 2");
		System.out.println("Thread 2");
		System.out.println("Thread 2");
		System.out.println("Thread 2");
	}
}

public class lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass3 myclass1 = new Myclass3();
		
		Thread t1 = new Thread(myclass1);
		
		t1.start();
		
		Myclass2 myclass2 = new Myclass2();
		
		Thread t2 = new Thread(myclass2);
		
		t2.start();
		
		

	}

}
