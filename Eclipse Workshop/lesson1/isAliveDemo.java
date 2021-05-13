package lesson1;


class Myclass3 extends Thread
{
	public void run()
	{
		for(int i=0;i<1;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Myclass4 extends Thread
{
	public void run()
	{
		for(int i=0;i<1;i++)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class isAliveDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Myclass3 M3 = new Myclass3();
			M3.start();
			
			Myclass4 M4 = new Myclass4();
			M4.start();
			
			System.out.println(M3.isAlive());
			System.out.println(M4.isAlive());
			System.out.println("Join function will run");
			M3.join();
			M3.join();
			
			System.out.println(M3.isAlive());
			System.out.println(M4.isAlive());

			
	}

}
