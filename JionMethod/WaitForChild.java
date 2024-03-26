package JionMethod;
/*
 * jion() --->thread wants to wait for another thread to completes its execution 
 * */
public class WaitForChild extends Thread{
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("child thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WaitForChild child = new WaitForChild();
		child.start();
		child.join();
		for(int i=0; i<5; i++)
		{
			
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
			
		}
	}
}
