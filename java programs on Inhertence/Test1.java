package javaprograms;

// if all variables are same then priority goes to local variable



public class Test1 extends Parent {
	
	int a = 300;//instance variable
	int b = 400;//instance variable
	
	void m1 (int a, int b)
	{
		System.out.println("parent class local variable output = " + (a+b) );
		System.out.println("child class local variable output = " + (a+b));
		System.out.println("child class instance variable output = " + (a+b));
	}
	

	
	public static void main(String[] args) {
		
		Test1 p = new Test1 (); //creating object
		p.m1(500, 600); // calling m1 method
		
		

	}

}
/*
parent class local variable output = 1100
child class local variable output = 1100
child class instance variable output = 1100
*/