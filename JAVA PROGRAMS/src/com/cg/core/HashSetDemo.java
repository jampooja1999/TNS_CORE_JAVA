package com.cg.core;

import java.util.HashSet;

public class HashSetDemo {
																		
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("A");
		h.add("B");
		h.add("c");
		h.add("A");
		h.add("B");
		System.out.println(h);
		
		h.remove("A");
		System.out.println(h);
		
		h.clear();
		System.out.println(h);
	}

}
