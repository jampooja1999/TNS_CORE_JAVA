package com.cg.core;

import java.util.Scanner;

class PrimeNumber {

	public static void main(String[] args) {
		int num, i=2, count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num= s.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
			System.out.println("\n"+num+" is a Prime Number.");
		else
			System.out.println("\n"+num+" is not a Prime Number.");

	}

}