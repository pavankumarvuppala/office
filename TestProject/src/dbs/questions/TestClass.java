package dbs.questions;

class A1{
	public int i;
	public int j = 5;
	
	void display(){
		
		System.out.println("From A1");
	}
}

class B2 extends A1{
	
	int j;
	
	void display(){
		
		super.i = 3;
		super.j = 10;
		
		
		System.out.println(i + " " + super.j );
		
	}
	
}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B2 obj = new B2();
		obj.i=1;
		obj.j= 2;
		
		obj.display();

	}

}
