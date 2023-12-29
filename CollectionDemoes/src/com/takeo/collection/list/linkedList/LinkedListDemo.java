package com.takeo.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String... tts) {
		LinkedList lk = new LinkedList();
		lk.add("durga");
		lk.add(30);
		lk.add(null);
		lk.add("durga");
		lk.set(0,  "Software");
		lk.add(0, "venky");
		lk.removeLast();
		lk.addFirst("CCC");
		System.out.println(lk);//[CCC, venky, software, 30, null]
		System.out.println(lk.get(0));//CCC
	}

}
