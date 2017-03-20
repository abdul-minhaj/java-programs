package javaprograms;

class Parent

{ 

	
	int a = 100;//parent class local variable
	int b = 200;//parent class local variable
	
}

public class CallingParentClass extends Parent {
	
	int i = 300;//instance variable
	int j = 400;//instance variable
	
	void m1 (int x, int y)
	{
		System.out.println("parent class local variable output = " + (a+b) );
		System.out.println("child class local variable output = " + (x+y));
		System.out.println("child class instance variable output = " + (i+j));
	}
	

	
	public static void main(String[] args) {
		
		CallingParentClass p = new CallingParentClass (); //creating object
		p.m1(500, 600); // calling m1 method
		
		

	}

}
/*
OUT PUT

parent class local variable output = 300
child class local variable output = 1100
child class instance variable output = 700

*/