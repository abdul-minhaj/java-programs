package javaprograms;

public class StringVSBuffer {
//String manipulation by String and string buffer
	
	public static void main(String[] args) {
		// String manipulation using String 
		long stime = System.currentTimeMillis();
		String msg = "Minhaj";
		for (int i = 0; i<10000; i ++)
		{msg = msg + "@HYD";}
		long etime = System.currentTimeMillis(); // calculating time duration of program
		System.out.println(etime-stime + "...using String method for manipulation of data");
		
		
long stime1 = System.currentTimeMillis();
// String manipulation using StringBuffer
		StringBuffer msg1 = new StringBuffer("Minhaj");
		for (int i = 0; i<10000; i ++)
		{msg1.append("@HYD");}
		long etime1 = System.currentTimeMillis(); // calculating time duration of program
		System.out.println(etime1-stime1 + "...using StringBuffer method for manipulation of data");
	}

}
/*
410...using String method for manipulation of data (takes more time)

2...using StringBuffer method for manipulation of data(takes less time)



*/