package SingleTaskFromSingleThread;

public class ThreadCreation extends Thread {
	@Override
	public void run()
	{
		System.out.println("thread created.....");
	}
	
	public static void main(String[] args) {
		ThreadCreation t1 = new ThreadCreation();
		t1.start();
		
	}
}
