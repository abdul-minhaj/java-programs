package javaprograms;

public class MethodOverLoadin {

	void m1(int a) // with same m1 () but different arguments type here INT
	
	{
		System.out.println("int m1 method");
	}
	
	void m1 (char ch)// with same m1 () but different arguments type here CHAR
	
	{
		System.out.println("char m1 method");
	}
	
	void m1 (int a, int b)// with same m1 () but different arguments(1 & 2-arug) here INT,
	
	{
		System.out.println("int a & int b m1 method");
	}
	public static void main(String[] args) {
		MethodOverLoadin OL = new MethodOverLoadin ();
		
		OL.m1(10);
		OL.m1('A');
		OL.m1(20,30);	
	}

}


/*

OUTPUT:

int m1 method
char m1 method
int a & int b m1 method

*/