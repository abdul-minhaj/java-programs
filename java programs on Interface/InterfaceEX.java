package javaprograms;

interface IT{
	
	void m1();
	void m2();
}

class InterfaceEX implements IT  {
	
	public void m1(){
		
		{
			System.out.println("m1 method");
		}
	}

    public void m2 () {
		
		{
			System.out.println("m2 method");
		}
	}
	public static void main(String[] args) {
		InterfaceEX I = new InterfaceEX();
		I.m1();
		I.m2();
		
		IT T = new InterfaceEX(); //Type Casting
		T.m1();
		T.m2();

	}

}
/* 
OUTPUT:

I.m1();
I.m2()
*/