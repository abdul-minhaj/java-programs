package javaprograms;
//Interface can also support multiple inheritance
// interface can extends multiple interface


interface WorldBank{
	void followWBGuideLine();
	} 
interface RBIBank{
	void dontAcceptOldNotes();
}

public class InterfaceSBH implements WorldBank, RBIBank {
	
	public void followWBGuideLine(){
		{
			System.out.println("I will follow Guid lines of World bank");
		}
	}
	
	
	public void dontAcceptOldNotes(){ 
		{
			System.out.println("I will not accept old currency notes");
		}
}
	 
	public static void main(String[] args) {
	
		InterfaceSBH S = new InterfaceSBH();
		S.followWBGuideLine();
		S.dontAcceptOldNotes();
	}

}
/*
 * OUTPUT:

I will follow Guid lines of World bank
I will not accept old currency notes
*/