package com.takeo;

import java.util.Scanner;

public class RemainderTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter an Integer");
			int a = scanner.nextInt();
			System.out.println("a%2 = "+a%2);
			System.out.println("a/2="+(a/2));

		}
	}
}
