package lesson1;

public class JavaStopExp extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                 
                sleep(500);  
                System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
         
        JavaStopExp t1=new JavaStopExp ();    
        JavaStopExp t2=new JavaStopExp ();   
        JavaStopExp t3=new JavaStopExp ();   


        t1.start();  
        t2.start();  
        t3.start();
   
        t3.stop(); 
       // System.out.println("Thread t3 is stopped");  
        
    }    
}  