package org.jala.java;

public class Day6string {

	public static void main(String[] args) {
		String s="jala";
		String e="JALA";
		String b="course ";
		System.out.println(s+b);// using+ 
		System.out.println(s.concat(b)); //usuing concat
		System.out.println(s.length());
		System.out.println(s.equals(e));
		System.out.println(s.equalsIgnoreCase(e));
		System.out.println(s.indexOf(2));
		System.out.println(s.substring(0, 2));
		System.out.println(s.replaceFirst("j", "h"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.matches(e));
		System.out.println(s.startsWith(b));

		System.out.println(s.trim());
		System.out.println(b.replace("c", "b"));
		System.out.println(s.split(b, 'j'));
		System.out.println(String.valueOf(e));
		int a=50;
		String h= Integer.toString(a);
System.out.println(a+20);
System.out.println(e.toLowerCase());
System.out.println(b.toUpperCase());

		
	
		
		
	}
	

}
