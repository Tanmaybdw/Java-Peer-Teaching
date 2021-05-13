package lesson1;
class Animal{}

public class InstaceExample extends Animal {
	static void method(Animal a) {  
		System.out.println(a instanceof InstaceExample);
	    if (a instanceof InstaceExample)
		{  
	    	InstaceExample d=(InstaceExample)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	    }  
	  }  
	   
	  public static void main (String [] args) {  
	    Animal a=new InstaceExample();  
	    InstaceExample.method(a); 
	    Animal b=null;
	    InstaceExample.method(b); 
	  }  
}
