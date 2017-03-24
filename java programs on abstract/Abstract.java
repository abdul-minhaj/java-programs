package javaprograms;
abstract class Test {
	
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("m4 () of abstract class");
	}
}
abstract class Test3 extends Test {// m2 & m3 () are not over ride so declare class as abstract
	
	void m1()
	{
		System.out.println("m1 () of abstract class");
	}
}

abstract class Test4 extends Test3 {// m3 () are not over ride so declare class as abstract
	
	void m2 ()
	{
		System.out.println("m2 () of abstract class");
	}
}
public class Abstract extends Test4{ // all abstract methods are override
	
	void m3()
	
	{
		System.out.println("m2 () of abstract class");
	}

	
	public static void main(String[] args) {
		
		Abstract A = new Abstract (); // create object for calling instance methods
		A.m1();
		A.m2();
		A.m3();
		A.m4();
		
		

	}

}

/*
OUTPUT:
m1 () of abstract class
m2 () of abstract class
m2 () of abstract class
m4 () of abstract class

*/