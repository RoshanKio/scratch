package com.takeo.collection.list.linkedList;

import java.util.Stack;

public class StackDemo {
	static public void main(String ...tts) {
		Stack s = new Stack();
		System.out.println(s.push("Roshan"));//Roshan
		s.push("Bimala");
		s.push(null);
		s.push("Nirmala");
		s.push("Arjun");
		System.out.println(s);//[Roshan, Bimala, null, Nirmala, Arjun]
		System.out.println(s.pop());//Arjun
		System.out.println(s);//[Roshan, Bimala, null, Nirmala]
		System.out.println(s.peek());//Nirmala
		System.out.println(s);//[Roshan, Bimala, null, Nirmala]
		System.out.println(s.search("Roshan"));//4
		System.out.println(s.search("Bimala"));//3
		System.out.println(s.search("Rosha"));//-1
		System.out.println(s.capacity());//10
	}

}
