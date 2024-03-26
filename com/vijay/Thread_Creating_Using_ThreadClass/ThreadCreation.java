package com.vijay.Thread_Creating_Using_ThreadClass;

public class ThreadCreation extends Thread {
	@Override
	public void run()
	{
		System.out.println("thread created.....");
		System.out.println("thread name : "+Thread.currentThread().getName());
		System.out.println("thread priority by default : "+Thread.currentThread().getPriority());
		System.out.println("I want to change thread name by using setName() : ...");
		currentThread().setName("new Thread");
		System.out.println("new Thread name is : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadCreation t1 = new ThreadCreation();
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
	}
}
