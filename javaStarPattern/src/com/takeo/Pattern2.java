package com.takeo;

public class Pattern2 {
	public static void main(String tts[]) {
		String str1 = "*";
		System.out.println(str1);
		for(int i = 1; i<=5; i++) {
			str1=str1+"*";
			System.out.println(str1);
		}
		
		int n = str1.length();
		
		for(int i = n-1; i>0; i--) {
			System.out.println(str1.substring(0, i));
		}
	}
}
