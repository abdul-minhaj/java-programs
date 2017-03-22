package javaprograms;

// return type must be same for method over riding


class parent3
{

int marry()
{
	System.out.println("marry kajol");
	
	return 10;
}

}
public class MORReturnType extends parent3 {
	
	
float marry() // with same m1 () but different return type 	
	{
		System.out.println("marry kaif"); 
		return 10.5f;
	
	}


	public static void main(String[] args) {
		
		MORReturnType M = new MORReturnType();
		
		M.marry();
		
		
	}

}

/*
OUTPUT:

The return type is incompatible with parent3.marry()

*/

