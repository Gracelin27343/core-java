package com.tnsif.day13.threads;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj = new UsingRunnable(2,6,"hello world !!!") ;
		
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				System.out.println("running task from anonymous class");
				
			}
			
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		runnable=new Runnable() {

			@Override
			public void run() {
				try
				{
					for(int i=1;i<=4;i++)
					{
						System.out.println("child thread task 3:"+i);
						Thread.sleep(1500);
					}
				}
				catch(InterruptedException e)
				{
					System.out.println("error");
				}
				
			}
			
		};
		thread = new Thread(runnable);
		thread.start();

	}

}