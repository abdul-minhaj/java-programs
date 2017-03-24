package javaprograms;

abstract class PatientDetails{
	
	String name = "Minhaj";
	
	void patientVitalDetails(){
		{
			System.out.println("I am working on patient Vital Details")	;
		}
	}
	abstract void patientSocialHistory();
	abstract void patientHistory();
	
}

public class AbstractEx extends PatientDetails {
	
	void patientSocialHistory() 
	{
		System.out.println("I am working on patient Social History");	
	}
	
	void patientHistory()
	
	{
		System.out.println("I am working on patient History");	
	}
	

	public static void main(String[] args) {
		
		AbstractEx a = new AbstractEx ();
		a.patientVitalDetails();
		a.patientSocialHistory();
		a.patientHistory();
	}

}

/*
 * OUTPUT
 
 I am working on patient Vital Details
I am working on patient Social History
I am working on patient History
*/
