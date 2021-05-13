package lesson1;


class Q
{
	int num;
	boolean valueset = false;
	
	public synchronized void put(int num)
	{
		
		while(valueset)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Put : "+num);
		this.num=num;
		
		valueset=true;
		notify();
	}
	
	public synchronized void get()
	{
		
		while(!valueset)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get : " +num);
		valueset=false;
		notify();
	}
}

class Producer implements Runnable
{
	Q q;
	
	public Producer (Q q)
	{
		this.q=q;
		Thread t= new Thread(this, "Producer");
		t.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	
	public Consumer(Q q)
	{
		this.q=q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	public void run()
	{
		while (true)
		{
			q.get();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class InterCommunication {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	
	}

}
