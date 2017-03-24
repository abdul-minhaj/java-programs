package javaprograms;

class A {
	
	interface Nested {
		void m1();
	}
}

public class InterfaceClass implements A.Nested{
	
	public void m1()
	
	{
		System.out.println("nested interface executed which is in class");
	}

	
	public static void main(String[] args) {
		
		InterfaceClass I = new InterfaceClass();
		I.m1();
		
		
	}

}
/* OUTPUT:

nested interface executed which is in class
//here IN is map
Nested entry//


*/