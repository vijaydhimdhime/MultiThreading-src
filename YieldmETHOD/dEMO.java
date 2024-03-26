package YieldmETHOD;

public class dEMO extends Thread{
	//static Thread mainThread;
	static Thread currentThread;
	public void run()
	{
		
		for(int i=0; i<5; i++)
		{
			try {
				//mainThread.join();
				currentThread.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child thread : "+i);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		// mainThread = Thread.currentThread();
		 currentThread = Thread.currentThread();
		dEMO d = new dEMO();
		d.start();
		//d.join();
		for(int i=0; i<5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main thread : "+i);
		}
		
	}
}
