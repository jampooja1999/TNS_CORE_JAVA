package com.cg.core;

public class Poly {

	 void print(int...a)
	{
		System.out.print("My arguments: ");
		for(int i:a) //Using for each loop to display contents of a
		System.out.print(i + " ");	
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Poly p=new Poly();
		p.print(10);
		p.print(56,20);
		p.print(10,20,30);
	}

}
