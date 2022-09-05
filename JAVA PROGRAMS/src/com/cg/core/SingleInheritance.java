package com.cg.core;

public class SingleInheritance
{
	public static void main(String[] args)   //Main Method
	{
		// Object of Child class
		Dog d = new Dog();
		d.name="Simba";
		d.display();
		d.eat();// for accessing the parent class method
	}
}
class Animal
{
	
		// Variables and Methods of Parent class
		String name;
		public void eat()
		{
			System.out.println("I can eat");
		}
		
		
}

 // Child class which inherited from Animal
class Dog extends Animal // child class
{
	public void display()
	{
		System.out.println("My name is..." + name);
	}
	
	
}

