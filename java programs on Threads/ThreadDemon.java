package javaprograms;
//Daemon thread : The thread which are executing at background for giving support to for ground or main method is called as Daemon Thread

// Once the main thread is executed all daemon threads executed automatically
public class ThreadDemon extends Thread {
	public void run() {
	
	for (int i = 0; i < 99; i++)
	{
		System.out.println("Daemon functionallty" + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
	
	

	
	public static void main(String[] args) throws InterruptedException {

		ThreadDemon t = new ThreadDemon();
	
		
		t.setDaemon(true); // check it by using javap java.lang.Thread
		
		t.start();
		for (int i = 0; i < 9; i++)
		{
			System.out.println("main thread: " + i);
			Thread.sleep(1000);
			if(i==5) //terminating abnormally when i value reaches 5
			{System.exit(0);
	}

	}
	}
}
