package org.jala.javabasic1;

/**
 * @author Monika
 *
 *
 */
public class JavaBasic {

	// global variable we can declare outside the method but within the class
	static int s = 100;

	public static void main(String[] args) {
		/**
		 * @persone name
		 */
		printName();
		System.out.println(s);
		Javabasic2 bb = new Javabasic2();
		bb.main(args);
		// System .out .println("this is comment out statament");
		/*
		 * this is multiline commentline. this is multiline commentline. this is
		 * multiline commentline.
		 */

		// r different Data Types int, Boolean, char, float, double
		boolean b = true;
		System.out.println(b);
		char c = 'm';
		System.out.println(c);
		double d = 11.2;
		System.out.println(d);
		float f = (float) 1.1;
		System.out.println(f);
		// local variable we can only declare within method
		int a = 10;
		System.out.println(a);
	}
	
	public static void printName() {
		System.out.println("monika");
	}
}
