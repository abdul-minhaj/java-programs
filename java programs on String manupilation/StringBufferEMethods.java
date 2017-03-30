package javaprograms;

public class StringBufferEMethods {

	//No execution of string outside the main method
	
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Minhaj is presently in hyderabad");
	// append is method to add data in StringBuffer
	System.out.println(sb.capacity());
	// default memory size of SB is 16, if its exceeds 16 then the valve will be increase as [16*2] + 2 = 34
	sb.append("for doing some software courses");
	System.out.println(sb.capacity());
	sb.append(961027544);
	System.out.println(sb.capacity());
/*
OUTPUT
16
34
70
142
 */
	
	
	
	}

}
