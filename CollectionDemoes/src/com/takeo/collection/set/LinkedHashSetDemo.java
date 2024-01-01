package com.takeo.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] tts) {
		LinkedHashSet h = new LinkedHashSet();
		System.out.println(h.add("B"));//trye
		System.out.println(h.add("C"));//true
		System.out.println(h.add("D"));//true
		System.out.println(h.add("Z"));//true
		System.out.println(h.add(null));//true
		System.out.println(h.add(10));//true
		System.out.println(h.add("Z"));//false
		System.out.println(h);
	}

}
