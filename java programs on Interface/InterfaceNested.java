package javaprograms;

interface IN{
	
	interface Nested {
		void m1();
	}
}

public class InterfaceNested implements IN.Nested{
	
	public void m1()
	
	{
		System.out.println("nested interface executed");
	}

	
	public static void main(String[] args) {
		
		InterfaceNested I = new InterfaceNested();
		I.m1();
		
		
	}

}
/* OUTPUT:

nested interface executed
//here IN is map
Nested entry//


*/