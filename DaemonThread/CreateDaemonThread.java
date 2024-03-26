package DaemonThread;

public class CreateDaemonThread extends Thread{
	@Override
	public void run()
	{
		System.out.println("child thread priority : "+currentThread().getPriority());
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread is daemon thread");
		}
		else
		{
			System.out.println("Thread is not daemon thread");
		}
		
	}
	public static void main(String[] args) {
		//Thread.currentThread().isDaemon();
		
		System.out.println("current thread is daemon thread : "+Thread.currentThread().isDaemon());
	//	currentThread().setDaemon(false);
		
		CreateDaemonThread daemon = new CreateDaemonThread();
		daemon.setDaemon(true);
		daemon.start();
		System.out.println(Thread.currentThread().getPriority());
	}

}
