package javaprograms;

public class StCreation2 {
	
	
	

	public static void main(String[] args) {
		String name = "Minhaj";
		String name1 = "Minhaj";
		
		if (name==name1)
		{
			System.out.println("yes using literal approach");
		}
		
		else 
			
		{
			System.out.println("No using Literal approach");
		}
	
	/* "Output yes using literal approach" because Here for every object creation compiler will check for any duplicate variable if
		if there is no variable then only JVM will create a new object. In our ex both are of same valve so no separate object created 
		*/
		
		String name2 =new String("Minhaj");
		String name3 =new String("Minhaj");
		
		if (name2==name3)
		{
			System.out.println("yes using literal approach");
		}
		
		else 
			
		{
			System.out.println("No using Literal approach");
		}
		
		
		/* "Output no using literal approach" directly created new object
		
		
		*/
		
		
		
	
	
	}

}
