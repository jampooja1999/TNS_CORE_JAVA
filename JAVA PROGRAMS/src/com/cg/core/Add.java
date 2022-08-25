package com.cg.core;
import java.util.Scanner;
public class Add
{
		public static void main (String[] args)
		{
		
			System.out.println("Entered First no.");
			Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
		
			System.out.println("Entered First no.");
			
			int b=sc.nextInt();
			
			int c= a+b;
			System.out.println("Addition = "+ c);
		}
}