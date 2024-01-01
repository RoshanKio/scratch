package com.takeo.collection.set;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetDemo {
	
	static public void main(String []tts) {
		String[] str = {"Roja", "ShobhaRani", "Rajakumari", "GangaBhavani", "Ramulamma"};
		
		System.out.println("------Alphabetical Order------");
		TreeSet t = new TreeSet();
		Stream.of(str).forEach(i->t.add(i));
		System.out.println(t);
		Comparator c = t.comparator();
		System.out.println(c);//null
		
		System.out.println("-----Reverse of Alphabetical Order------");
		TreeSet tr = new TreeSet(new MyComparator());
		Stream.of(str).forEach(i->tr.add(i));
		System.out.println(tr);
		Comparator c1 = tr.comparator();
		System.out.println(c1);
		
	}

}