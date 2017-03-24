package javaprograms;


interface RBI1 {
	void proviedLoans();
	void proviedInsurance();
	void proviedCreditCard();
}

abstract class ICICI implements RBI1 {
	public void proviedLoans()
	{
		System.out.println("ICICI banks provide Loans");
	}	
}

abstract class SBI1 extends ICICI {
	public void proviedInsurance()
	{
		System.out.println("SBI banks provide Insurance");
	}
	
}
public class InterfaceEX2 extends SBI1{
	
	public void proviedCreditCard(){
		
		{
			System.out.println("banks should provide Credit card");
		}
	}

	public static void main(String[] args) {

		InterfaceEX2 I = new InterfaceEX2();
		
		I.proviedLoans();
		I.proviedInsurance();
		I.proviedCreditCard();
		
	}

}
/*
OUTPUT:

ICICI banks provide Loans
SBI banks provide Insurance
banks should provide Credit card
*/