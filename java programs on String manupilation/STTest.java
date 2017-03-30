package javaprograms;
import java.util.StringTokenizer;
	
	public class STTest { 
		
	public static void main(String[] args) { 
				
				String emailID = "abdul_minahj@ymail.com, minhaj_abdul@ymail.com, abdulminhajs@gmail.com" ;
				StringTokenizer tokenizer= new StringTokenizer(emailID,","); 
				while(tokenizer.hasMoreTokens())// is used to check next element available or not
					
				{
					String email=tokenizer.nextToken(); // is used to print next element
					System.out.println(email);
			
				}
		
		}
	}
