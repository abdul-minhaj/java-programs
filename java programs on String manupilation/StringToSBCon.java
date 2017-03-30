package javaprograms;

public class StringToSBCon {

	
	public static void main(String[] args) {
		String Str = "minhaj";
		StringBuffer sb = new StringBuffer (Str);// Conversation of string to StringBuffer
		System.out.println(sb.reverse());
		
		StringBuffer  sb1 = new StringBuffer("minnu");
		String ss = sb1.toString();// here to string will return string here ss
		System.out.println(ss);

	}

}
