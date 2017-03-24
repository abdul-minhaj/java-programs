package javaprograms;

abstract class ParentAbstract // if a class contain abstract method, it should be declared by abstract 
{
	abstract void m1 (); //an abstract method should ends with ; ... for abstract class there should be no body for implementation
	abstract void m2 ();
	void m3 () // can't create object for abstract class
	{
		System.out.println(" m3 method of abstract class ");
		
	}

}


public class AbstracTest extends ParentAbstract {
	
	void m1() 
	{
		System.out.println(" m1 method of abstract class"); // abstract () of parent should be override if not declare the class with abstract
	}

	void m2()
	{
		System.out.println(" m2 method of abstract class");
	}
	
	
	void m4()
	
	{
		System.out.println(" m4 method of child/normal class");
	}
	
	
	public static void main(String[] args) {
		
		AbstracTest t = new AbstracTest(); // calling objects by creating child class object
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		
		
		
		 ParentAbstract a = new AbstracTest ();// calling objects by type casting
		 a.m1();
		 a.m2();
		 a.m3();
		 ((AbstracTest) a).m4();
	}

}

/*OUTPUT:
 *  m1 method of abstract class
 m2 method of abstract class
 m3 method of abstract class 
 m4 method of child/normal class
 */
