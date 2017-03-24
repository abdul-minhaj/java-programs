package javaprograms;


// Interface is have Inheritance properties

interface I1 
{ void m1(); }

interface I2 extends I1
{ void m2(); }

interface I3 extends I2
{ void m3(); }



public class InterfaceInheretance implements I3 {

	public void m1(){
	{ System.out.println("m1 method"); }
	}
	
	public void m2(){
		{ System.out.println("m2 method"); }
		}
	
	public void m3(){
		{ System.out.println("m3 method"); }
		}
	
	public static void main(String[] args) {
		InterfaceInheretance II = new InterfaceInheretance();
		II.m1();
		II.m2();
		II.m3();
	}

}

/* output
 m1 method
m2 method
m3 method
*/
