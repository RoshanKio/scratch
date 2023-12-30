package com.takeo.collection.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String []tts) {
		
		HashSet h = new HashSet();
		System.out.println(h.add("A"));;//true
		System.out.println(h.add("A"));;;;//false
		System.out.println(h.add(null));;;;;;//true
		System.out.println(h.add(null));;;;;;;;;//false
		System.out.println(h.add("E"));;;;;//true
		System.out.println(h.add("D"));;//true
		System.out.println(h.add("B"));//true
		
		
		
		
		
		System.out.println(h);//[null, A, B, D, E]
		
		
		
	}

}
