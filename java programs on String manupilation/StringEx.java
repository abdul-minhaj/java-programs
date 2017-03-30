package javaprograms;

public class StringEx {

	StringEx (String str) { // created constructor 
	}
	public static void main(String[] args) {
		
		StringEx st1 = new StringEx ("abdul");
		StringEx st2 = new StringEx ("abdul");
		System.out.println(st1.equals(st2)); // false bcoz new object is created 
		
		String s1 = "abdul";
		String s2 = "abdul";
		System.out.println(s1.equals(s2));//true bcoz both variables will be pointed to same object
		
		StringBuffer sb1 = new StringBuffer("minnu");
		StringBuffer sb2 = new StringBuffer("minnu");
		System.out.println(sb1.equals(sb2));//false same reason as string created with new operator
		
	}

}
