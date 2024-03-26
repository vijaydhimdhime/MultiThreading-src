package JionMethod;

public class WaitForMain extends Thread{
	private static Thread mainThread;

	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			
			try {
				mainThread.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread : "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		mainThread = Thread.currentThread();
		WaitForMain child = new WaitForMain();
		child.start();
		for(int i=0; i<5; i++)
		{
			
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
			
		}
	}
}
