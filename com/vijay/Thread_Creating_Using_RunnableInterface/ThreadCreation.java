package com.vijay.Thread_Creating_Using_RunnableInterface;

public class ThreadCreation extends Thread implements Runnable{
	@Override
	public void run()
	{
		System.out.println("thread created.....");
		System.out.println("thread name : "+Thread.currentThread().getName());
		System.out.println("thread priority by default : "+Thread.currentThread().getPriority());
		System.out.println("I want to change thread name by using setName() : ...");
		//Thread().setName("new Thread");
		Thread.currentThread().setName("new runnable thread");
		System.out.println("new Thread name is : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadCreation t1 = new ThreadCreation();
		Thread th = new Thread(t1);
		//th.setName("vijay");
		th.start();
		System.out.println(Thread.currentThread().getName());
		
	}
}
