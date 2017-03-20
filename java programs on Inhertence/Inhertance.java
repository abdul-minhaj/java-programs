package javaprograms;

class Bank
{
	
public void proviedLoans()

{
	System.out.println("bank has to provied loans");

}

public void proviedMoneyTrx()

{
	System.out.println("bank has to provied money trx");

}


}

public class Inhertance extends Bank {

	
	public static void main(String[] args) {
		
		Bank i = new Bank();
		i.proviedLoans();
		i.proviedMoneyTrx();
		
		

	}

}
