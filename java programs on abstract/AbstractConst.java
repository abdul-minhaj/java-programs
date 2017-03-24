package javaprograms;

// constructor allowed in abstract class or not
abstract class Const{
	
	Const()
	{
		System.out.println("I am from constructor of abstract class");
	}
	
	abstract void m1();
}

public class AbstractConst extends Const {
	
	void m1()
	
	{
		System.out.println("I am from m1() of abstract class");
	}
	
	AbstractConst()
	{ 
		super(); // not compulsory by default complier we call super()
		System.out.println("I am from constructor of normal class");
	}

	
	public static void main(String[] args) {
		
		AbstractConst a = new AbstractConst();
		a.m1();
	
	}

}

/* 
 * output:
I am from constructor of abstract class
I am from constructor of normal class
I am from m1() of abstract class

*/
