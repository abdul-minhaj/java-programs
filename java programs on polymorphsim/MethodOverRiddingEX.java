package javaprograms;
// for method overriding we need two java classes with parent and child relation


class parent2
{

void marry()
{
	System.out.println("marry kajol");
}

}
public class MethodOverRiddingEX extends parent2 {
	
	
void marry() // with same m1 () but different arguments type here INT
	
	{
		System.out.println("marry kaif"); // here we are overriding parent class method(over ridden) with child class method (over riding)
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverRiddingEX M = new MethodOverRiddingEX();
		
		M.marry();
		
		
	}

}

/*
OUTPUT:

marry kaif

*/
