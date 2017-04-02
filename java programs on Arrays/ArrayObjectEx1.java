package javaprograms;


// PreDefineClassEmp is PreDefine Class 

public class ArrayObjectEx1 {
	

	public static void main(String[] args) {
		
		PreDefineClassEmp[] e = new PreDefineClassEmp[3];// array list taking objects of different class
		
		PreDefineClassEmp e1 = new PreDefineClassEmp(111, "Abdul"); // installation of array list
		PreDefineClassEmp e2 = new PreDefineClassEmp(121, "Minhaj");
		PreDefineClassEmp e3 = new PreDefineClassEmp(113, "Minnu");
		
		
		
		e[0]= e1;// Initialization of array list
		e[1]= e2;
		e[2]= e3;
		
		for (PreDefineClassEmp ee : e)
		{
			System.out.println(ee.eid + "....." +ee.ename);
		}
	}

}
