package SingleTaskFromMultipleThread;

public class ThreadCreation extends Thread {
	@Override
	public void run()
	{
		System.out.println("thread created.....");
	}
	
	public static void main(String[] args)			//main Thread
	{
		ThreadCreation t1 = new ThreadCreation();   // 1st thread
		t1.start();   
		ThreadCreation t2 = new ThreadCreation();	// 2nd thread
		t2.start();   
		ThreadCreation t3 = new ThreadCreation();	// 3rd thread
		t3.start();  
		
	}
}
