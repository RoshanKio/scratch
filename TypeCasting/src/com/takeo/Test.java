package com.takeo;

public class Test {

	public static void main(String[] args) {
		Father father = new Son();
		GrandFather grandFather = father;
		Father father1 = father;
		Son son = (Son)father;
		GrandSon grandSon = (GrandSon)father;
		
		

	}

}
