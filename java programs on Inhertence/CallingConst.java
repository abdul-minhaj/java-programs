package javaprograms;

class Parent1
{
 
	Parent1()
{
	System.out.println("Parent1 0-args-const");
}
}

public class CallingConst extends Parent1 {

	
	CallingConst ()
	
	{
		this (10); //calling child 1-arug const
		System.out.println("Child 0-args-const");
	}
	
	CallingConst (int a)
	{
		super(); // calling parent 0-args const
		System.out.println("Child 1-args-const");
	}
	
	public static void main(String[] args) {
		new CallingConst(); // calling child 0-arug const

	}

}
/* OUTPUT

Parent1 0-args-const
Child 1-args-const
Child 0-args-const

*/