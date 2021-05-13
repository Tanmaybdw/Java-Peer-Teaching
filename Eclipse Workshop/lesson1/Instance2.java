package lesson1;

interface Printable{}  


class A implements Printable{  
	
	public void a(){System.out.println("a method");}  
}  
class B implements Printable{  
	
	public void b(){System.out.println("b method");}  
}  
  
class Call{  
	void invoke(Printable p){//upcasting  
		
		if(p instanceof A){  // False
			A a=(A)p;//Downcasting   
			a.a();  
		}  
		
		if(p instanceof B){  // True
			B b=(B)p;//Downcasting   
			b.b();  
		}  
  
	}  
}

public class Instance2 {
	
	public static void main(String args[]){  
		
		Printable p=new A();  
		Call c=new Call();  
		c.invoke(p);  
	}	
}