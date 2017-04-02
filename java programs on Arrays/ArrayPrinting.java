package javaprograms;

public class ArrayPrinting {

	
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60};
		
		// first approach to print array, by using this we can print particular element
		
		System.out.println(a[0]); //10
		System.out.println(a[2]); //30
		System.out.println(a[4]); //50
		System.out.println(a[1]); //20
		
		
		// Second Approach using for loop
		
		for(int i=0; i < a.length; i++)
		{
			System.out.println("using for loop " + a[i]);
		}
		
		// Third approach by using for each loop
		
		for (int i:a) // here "a" is what to print & "i" which type to print
		{
			System.out.println("using for each loop " + i);
		}
	}

}
