package javaprograms;

// if all variables are same then priority goes to local variable


public class Test2 extends Parent {
	
	int a = 300;//instance variable
	int b = 400;//instance variable
	
	void m1 (int a, int b)
	{
		System.out.println("parent class local variable output = " + (a+b) ); // by default local variables are called
		System.out.println("child class local variable output = " + (this.a+this.b));// "this" keyword is used to call instance variable
		System.out.println("child class instance variable output = " + (super.a+super.b));//"super" keyword is used to call parent class variable
	}
	

	
	public static void main(String[] args) {
		
		Test2 p = new Test2 (); //creating object
		p.m1(500, 600); // calling m1 method
		
		

	}

}