package javaprograms;

class Parent4{
	
	void m1 ()
	{
		
		System.out.println("m1 method of parent");
	}
	
}

public class OverRiddingEx extends Parent4{
	
	void m1 () 
	{
		
		System.out.println("m1 method of child");
		// over riding parent method m1
	}
	
	
	void m2 ()
	{
		
		System.out.println("m2 method of child");
	}

	
	public static void main(String[] args) {
		

		Parent4 p = new OverRiddingEx ();

		p.m1();
		p.m2();
		

	}

}
