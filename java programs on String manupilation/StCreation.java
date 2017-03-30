package javaprograms;
// two approaches to create string class and it is final class and always declare in main method only

public class StCreation {

	public static void main(String[] args) {
		// first approach String literal
		
		String a = "Minhaj";
		String m = "abdul";
		
		System.out.println("String created by literal approach..." + m +"\n" + "String created by literal approach.." + a);
		
		// Second approach String new operate method
		
				String s1 = new String("Hyderabad");
				String s2 = new String("NareshIT");
		System.out.println("String created by new operator approach..." + s2+ "\n" + "String created by new operator approach..." + s1);
	}

}
/*output:
String created by literal approach...abdul
String created by literal approach..Minhaj
String created by new operator approach...NareshIT
String created by new operator approach...Hyderabad
*/