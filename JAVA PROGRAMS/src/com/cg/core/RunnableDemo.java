package com.cg.core;

public class RunnableDemo {

	public static void main(String[] args) {
		
		ThreadDemo obj= new ThreadDemo();
		obj.run();                          //........Starting the thread
		
		//.........thread1.......
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am main Thread");
		}

	}

	}


class ThreadDemo implements Runnable
{
	//..........thread2.........
	
	public void run()         //............make it run
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Thread");
		}
	}
}