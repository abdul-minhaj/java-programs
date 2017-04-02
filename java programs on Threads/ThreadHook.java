package javaprograms;

//hook thread will just executed just before the termination of JVM by normal or abnormal it is useful to cut DB connection, file connection etc


public class ThreadHook extends Thread {
 public void run ()
 {System.out.println("hook functionallty");}
	public static void main(String[] args) throws InterruptedException {
		
		ThreadHook t = new ThreadHook();
		Runtime r = Runtime.getRuntime ();
		r.addShutdownHook(t); // here we want to create ThreadHook class as Hook class so pass its variable value in to addShutdownHook 
		/* we can  make thread as hook thread by addShutdownHook()
		 * But addShutdownHook() belongs to RunTime class, so runtime object is created with method getRuntime 
		 */
		
		//logics of main 
		for (int i = 0; i < 9; i++)
		{
			System.out.println("main thread: " + i);
			Thread.sleep(500);
			if(i==5) //terminating abnormally when i value reaches 5
			{System.exit(0);}
		}
	}

}
