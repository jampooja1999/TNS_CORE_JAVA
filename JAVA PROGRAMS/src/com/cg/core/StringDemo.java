package com.cg.core;

public class StringDemo {

	public static void main(String[] args) {
		//here we are creating 3 objects.
		/*String s1= new String("Pooja");//2 object in heap and string constant pool
		String s2= new String("Pooja");
		String s3= "Pooja";
		String s4= "Pooja";*/
		
		String s1= new String("Pooja"); // memory will allocate in heap and string constant pool
		String s2= new String("Pooja");
		String s3= new String("Prasad");
		
		System.out.println(s1.compareTo(s2)); // compareTo method
		System.out.println(s1.compareTo(s3));// compareTo method
		
		//System.out.println(s1==s2); // == operator
		
		/*System.out.println(s1.equals(s2)); // This we can use for password matching in the point of upper or lower case
		System.out.println(s1.equalsIgnoreCase(s2));*/ //equalsIgnoreCase method
	}

}
