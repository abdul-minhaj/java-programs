package javaprograms;

//Three approach for creation of String Buffer i.e by new operator, its a thread safety.

public class StringBufferCreation {

	//First Approach
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer ("Abdul");
		StringBuffer sb2 = new StringBuffer ("Minhaj");
		System.out.println(sb1 +"\n"+ sb2);

		
		//Second Approach
		StringBuffer SB2 = new StringBuffer();
		System.out.println(SB2.capacity());
	
		//Second Approach
				StringBuffer SB3 = new StringBuffer(100);
				System.out.println(SB3.capacity());
				// Initial capacity of buffer is 16 but by using this approach for creation of SB we can increase capacity of SB
	}
	

}
