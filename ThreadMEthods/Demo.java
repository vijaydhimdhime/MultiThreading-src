package ThreadMEthods;

public class Demo extends Thread{
	@Override
	public void run()
	{
		System.out.println("======");
		for(int i=0; i<3;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		Demo d = new Demo();
		d.start();
	}

	

}
