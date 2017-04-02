package javaprograms;


// PreDefineClassEmp is PreDefine Class 

public class ArrayObjectEx2 {
	

	public static void main(String[] args) {
		
		PreDefineClassEmp[] e = new PreDefineClassEmp[5];// array list taking objects of different class
		
		PreDefineClassEmp e1 = new PreDefineClassEmp(111, "Abdul"); // installation of array list
		PreDefineClassEmp e2 = new PreDefineClassEmp(121, "Minhaj");
		PreDefineClassEmp e3 = new PreDefineClassEmp(113, "Minnu");
		
		
		
		e[0]= e1;// Initialization of array list
		e[2]= e2;
		e[4]= e3;
		
		
		
		/*here e[1] e [3] is empty
		therefore we will get NullPointerException during compile time error
		to overcome this use instanceof 
		
		*/
		for (Object O : e) // object storing null data and Emp object class..Object class is parent class for all classes
		
		{
			
		if (O instanceof PreDefineClassEmp ) // instanceof is used to check type of object
			{	
				PreDefineClassEmp ee  = (PreDefineClassEmp) O;// type casting
				System.out.println(ee.eid + "....." +ee.ename);
			}
		
		if (O == null)
			{
				System.out.println(O);
			}
		
		}
	}

}
