package javaprograms;
class RBI {

public void rejectOldNotes()
{
	System.out.println( "RBI----Please dont accept old 500 & 1000 currency notes");	
}

}

class SBI extends RBI{
	public void SBIFllowingRules()
	
	{
		System.out.println( "SBI----We will not accept old 500 & 1000 currency notes");
	}
	
}
public class MultiLevelInhertence extends SBI {

	
	public static void main(String[] args) {
		MultiLevelInhertence m = new MultiLevelInhertence ();
		m.rejectOldNotes();
		m.SBIFllowingRules();

	}

}
