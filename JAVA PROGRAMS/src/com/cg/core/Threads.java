package com.cg.core;

public class Threads {

	public static void main(String[] args) 
	{
		MyThread obj= new MyThread();
		Thread t1=new Thread(obj);
		t1.start();                          //........Starting the thread
		
		//.........thread1.......
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am main Thread");
		}

	}

}

class MyThread extends Thread
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
