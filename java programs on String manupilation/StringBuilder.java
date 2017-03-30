package javaprograms;

public class StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long stime1 = System.currentTimeMillis();
		// String manipulation using StringBuffer
				StringBuffer msg1 = new StringBuffer();
				for (int i = 0; i<10000; i ++)
				{msg1.append("Minhaj@HYD");}
				long etime1 = System.currentTimeMillis(); // calculating time duration of program
				System.out.println(etime1-stime1 + "...using StringBuffer method for manipulation of data");
				
				
		long stime2 = System.currentTimeMillis();
		// String manipulation using StringBuffer
				StringBuilder msg2 = new StringBuilder();
				for (int i = 0; i<10000; i ++)
				{msg2.append ();}
				long etime2 = System.currentTimeMillis(); // calculating time duration of program
				System.out.println(etime2-stime2 + "...using StringBuffer method for manipulation of data");
			}
}

		
		/*
		410...using String method for manipulation of data (takes more time)

		2...using StringBuffer method for manipulation of data(takes less time)



		*/
	


