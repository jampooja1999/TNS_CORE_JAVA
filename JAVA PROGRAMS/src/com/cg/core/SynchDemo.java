package com.cg.core;

// Use of Synchronization in JAVA...........

public class SynchDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		Counter c= new Counter();
		
		// First Thread creation
		
		Thread t1= new Thread(new Runnable()               /// thread using runnable() method.....
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.inc();
				}
			}
		
		});
			
		
	// Second Thread creation
		Thread t2 =new Thread(new Runnable()             /// thread using runnable() method.....
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.inc();
				}	
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}
class Counter 
{
	int count;
	 public synchronized void inc()
	{
		count++;
	}
}