package application;

import java.util.Scanner;

import services.PrintServiceGenerics;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Using Generics Class - Liste de Integers");

		PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<>();

		System.out.println("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		
		System.out.println("Using Generics Class - Lista de Strings");

		PrintServiceGenerics<String> ps2 = new PrintServiceGenerics<>();

		System.out.print("How many values? ");
		int y = sc.nextInt();

		for (int i = 0; i < y; i++) {
			String value = sc.next();
			ps2.addValue(value);
		}

		ps2.print();
		String z = ps2.first();
		System.out.println("First: " + z);

		sc.close();
	}
}