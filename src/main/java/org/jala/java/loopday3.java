package org.jala.java;

public class loopday3 {

	public static void main(String[] args) {
		ifPrintLoop1();
		whileloop2();

	}

	public static void ifPrintLoop1() {
		int h = 10;
		for (int i = 1; i <= h; i++) {
			System.out.println("Bright IT Career");
		}
	}

	public static void whileloop2() {
		int a = 1;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
	}

	public static void loopOperator() {
		int a = 20;
		int b = 10;
		while (a <= b) {
			System.out.println("true");
		}
	}

	public static void oddEvenno() {
		int num = 1;
		if (num / 2 == 0) {
			System.out.println("this is even no");
		} else {
			System.out.println("this is 0dd no");
		}
	}

	public static void printlarest() {

		int p = 1;
		int o = 20;
		int u = 40;
		if (p > o && p > u) {
			System.out.println("p is largest");
		} else if (o > p && o > u) {
			System.out.println("0 is largest");
		} else {
			System.out.println("u is largest");
		}
	}
	
public static void evenno100() {
		
		int f = 10;
		while (f <= 100) {
			if (f % 2 == 0) {
				System.out.println(f);
			}
			f++;
		}
		// do while loop
		int h = 1;
		do {
			System.out.println(h);
			h++;

		} while (h <= 10);

	}

	// Armstrong number or not
}
