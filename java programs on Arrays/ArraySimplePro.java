package javaprograms;

public class ArraySimplePro {

	public static void main(String[] args) {
		// Addition of array Output : 160,360,6360,6480
		int [] a = {150,10,200,6000,120};
		int sum = 0;
		for (int i:a)	
		{sum = sum + i ;
		System.out.println( "sum of array list :" + sum);}
		
		// Finding largest & smallest number in array
		int largest  = Integer.MIN_VALUE;// wrapper class methods
		int smallest = Integer.MAX_VALUE;// wrapper class methods
		
		for(int i = 0; i<a.length; i++)
		{
			if (a[i] > largest)
				largest = a[i];
			else if (a[i] < smallest)
				smallest = a[i];
			
		}
		
		System.out.println("largest number in array : " + largest);
		System.out.println("smallest number in array : " + smallest);
	}

}
