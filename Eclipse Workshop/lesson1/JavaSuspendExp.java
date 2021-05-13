package lesson1;

public class JavaSuspendExp extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        JavaSuspendExp t1=new JavaSuspendExp ();    
        JavaSuspendExp t2=new JavaSuspendExp ();   
        JavaSuspendExp t3=new JavaSuspendExp ();   
        // call run() method   
        t1.start();  
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   
        // call run() method   
        t2.resume();
        t3.start();  
    }    
}  