package javaprograms;

//if we are having multiple task no need of over writing all logics in run method just call those methods in run ()

public class ThreadEx3 extends Thread {
	
	public void run()
	{ 
		m1();
		m2();
		m3();
		
	{System.out.println(" run method");}
	}

	void m1(){System.out.println("m1 method");}// multiple task no 1
	void m2(){System.out.println("m2 method");}// multiple task no 2
	void m3(){System.out.println("m3 method");}// multiple task no 3
	
	
	
	
	public static void main(String[] args) {
		ThreadEx3 t = new ThreadEx3();
		t.start();
		{System.out.println("main thread method");}
		
		
	}

}
