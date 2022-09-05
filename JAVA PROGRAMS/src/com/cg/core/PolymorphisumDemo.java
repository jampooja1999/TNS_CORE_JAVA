package com.cg.core;

public class PolymorphisumDemo {

	void print()
	{
		System.out.println("No Parameter");
	}
	
	void print(int a)
	{
		System.out.println("Integer parameters");
	}
	
	void print(float b)
	{
		System.out.println("Float parameter");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		PolymorphisumDemo p=new PolymorphisumDemo();
		p.print();
		p.print(56);
		p.print(6.8f);
	}

}
