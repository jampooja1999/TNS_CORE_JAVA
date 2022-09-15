package com.cg.core;

import java.util.Arrays;
import java.util.List;

public class WCOperatorDemo {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(12,13,89,15,90,53);
		List <Double> list2 =Arrays.asList(12.22,56.58,66.89,12.10,78.36);
		display(list1);
		display(list2);
	}
	
	public static void display(List<?> list) 		// ? unknown type (Wild Card Operator)
	{
		System.out.println(list);
	}
}
