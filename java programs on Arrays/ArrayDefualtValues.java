package javaprograms;

public class ArrayDefualtValues {

	public static void main(String[] args) {
		int [] a ; // Null value for int 0
		a = new int [3];
		for (int i:a) 
		{
			System.out.println(i);

		}

		boolean [] a1 ; // Null value for boolean false
		a1 = new boolean [3];
		for (boolean b : a1)
		{
			System.out.println(b);
		}
}
}

/*OUTPUT:
0
0
0
false
false
false
*/