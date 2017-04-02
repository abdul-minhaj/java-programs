package javaprograms;

// multiple threads can perform single task

	public class ThreadEx5 extends Thread {
	public void run()
	{System.out.println("single task is Executed by no of threads(process)");}

	public static void main(String[] args) {
		ThreadEx4 t = new ThreadEx4 (); 
		t.start();
		//{System.out.println("Executed by first thread/process t.start" );}

		ThreadEx4 t1 = new ThreadEx4 (); 
		t1.start();
		//{System.out.println("Executed by second thread/process t1.start" );}
		
		ThreadEx4 t2 = new ThreadEx4 (); 
		t2.start();
		//{System.out.println("Executed by third thread/process t2.start" );}
	}

}
