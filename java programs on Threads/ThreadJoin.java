package javaprograms;
// join Thread : One thread should be in wait position until completion of another thread

public class ThreadJoin extends Thread {
	
public void run(){

for (int i = 0; i < 5; i++)
{System.out.println(Thread.currentThread().getName()+"...." +i );
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}

}
}

public static void main(String[] args) throws InterruptedException {
	ThreadJoin t = new ThreadJoin();
	ThreadJoin t1 = new ThreadJoin();
	
	t.start();
	t1.start();
	
	t.join(); // main method has to join until completion of t1 
	
	
	
	for (int i = 0; i < 5; i++)
	{
		System.out.println("main thread = "  + i);
		Thread.sleep(500);
	}
	
	}

}
