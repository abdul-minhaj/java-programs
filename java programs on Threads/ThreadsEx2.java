package javaprograms;
 
//run () is capable to call only 0 arus run(), if we want to call 1-arus then call it explicitly (by calling class name in main() or by using cont )
public class ThreadsEx2 extends Thread {
	public void run()
	{ 
		run(10);// calling one arug run () by const
		for (int i = 0; i < 2; i++)
		{
			System.out.println(" 0 arug User defined thread: " + i);
		}
	}
	
	public void run(int a)// overloading run method, but here jvm will only call 0-arug run(), for calling overloaded method we have to call it by name t.run(2) or calling const
	{
		for (int a1 = 3; a1 < 5; a1++)
		{
			System.out.println(" 1 arug User defined thread: " + a1);
		}
	}

	public static void main(String[] args) {
		
		ThreadsEx2 t = new ThreadsEx2();
		t.start();
		//t.run(2);.....calling one-arug by class name
		
		for (int j= 5; j < 7; j++)
		{
			System.out.println("main thread method : " + j);
		}
		
		

	}

}
