package javaprograms;

 

	 public class DefualtKeywordsGen extends Parent1 {

		
		 DefualtKeywordsGen ()
		
		{
			//this (10); //calling child 1-arug const
			System.out.println("Child 0-args-const");
		}
		
		 DefualtKeywordsGen(int a)
		{
			//super(); // calling parent 0-args const
			System.out.println("Child 1-args-const");
		}
		
		public static void main(String[] args) {
			new DefualtKeywordsGen(); // calling child 0-arug const
			new DefualtKeywordsGen(10);// calling child 1-arug const
		}

	}
	 
	 /*
	 
	 CONCLUSION: By default compiler will create Super Keyword with 0-arug two time bcoz two child class methods are called 
	 Parent1 0-args-const
	 Child 0-args-const
	 Parent1 0-args-const
	 Child 1-args-const
	 */