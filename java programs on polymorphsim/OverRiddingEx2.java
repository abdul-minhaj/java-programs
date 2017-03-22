package javaprograms;

//stuck with this program will execute later


class Parent4{
	
	void m1 ()
	{
		
		System.out.println("m1 method of parent");
	}
	
}

public class OverRiddingEx2 extends Parent4{
	
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
		

		Parent4 p = new m1();
		Parent4 p = new m2();

		p.m1();
		p.m2();	

	}

}
