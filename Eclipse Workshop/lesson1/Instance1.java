package lesson1;

class Example{
	
}
public class Instance1 extends Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance1 in = new Instance1();
		System.out.println(in instanceof Instance1);
		
		Instance1 in1=null;
		System.out.println(in1 instanceof Instance1);
		
		Instance1 in2=new Instance1();
		System.out.println(in2 instanceof Example);
	}
}
