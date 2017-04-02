package javaprograms;
/* imp points : it is not recommended to call start(), our class start() is override so thread class run() will not executed
 2. threads execution will be decided by thread scheduler
 3. run () will not invoke explicitly it will invoke only when start () is called
 4. if we will call run() explicitly then it behaves like normal () not like thread ()
 

*/


public class ThreadsEx extends Thread {
	public void run()
	{
		for (int i = 0; i < 99; i++)
		{
			System.out.println("User defined thread: " + i);
		}
	}

	public static void main(String[] args) {
		
		ThreadsEx t = new ThreadsEx();
		t.start();
	
		
		for (int j= 100; j < 200; j++)
		{
			System.out.println("main thread method : " + j);
		}
		
		

	}

}
