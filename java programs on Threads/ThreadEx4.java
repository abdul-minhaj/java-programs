package javaprograms;

// multiple threads can perform single task

	public class ThreadEx4 extends Thread {
	public void run()
	{}

	public static void main(String[] args) {
		ThreadEx4 t = new ThreadEx4 (); 
		/*t.start();
		{System.out.println(t.getName() );}// thread-0

		ThreadEx4 t1 = new ThreadEx4 (); 
		t1.start();
		{System.out.println(t1.getName() );}// thread-1
		*/
		
		//...............................................//
		
		t.start();
		t.setName("Minhaj");
		{System.out.println(t.getName() );}// minhaj

		ThreadEx4 t1 = new ThreadEx4 (); 
		t1.start();
		t1.setName("abdul");
		{System.out.println(t1.getName() );}// abdul 
		
		{System.out.println(Thread.currentThread().getName() );} // main
		
		Thread.currentThread().setName("MINNUUUUU_MAIN"); //MINNUUUUU_MAIN
		{System.out.println(Thread.currentThread().getName() );}
		
	
		{System.out.println(t.getId() );}//9
		{System.out.println(t1.getId() );}//10
		
		{System.out.println(t1.isAlive() );}// if running true else false
		{System.out.println(Thread.activeCount() );}// output vary depend on present situation
		
		
		
		
		
		
		
		
		
	}

}
