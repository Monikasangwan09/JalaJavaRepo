package org.jala.java;

public class Day5 {
static int b =20;// static variable
int c=30;//instance variabe

	public static void main(String[] args) {
		Day5 dd = new Day5();//
		dd.m2();//instance method in to static method
		//m2();
		System.out.println(dd.c);//printinf instance var into static mathod
		m3();//static method into main method
	}
	
	
	public void m2  () {//instance method
		int a=10;// local  variable
	System.out.println(b);//static variable into instance method
	 System.out.println(a+b); 
m3();//staic method within non staic method
}
	public static void m3() {
		int f=60;
		System.out.println(f);
}}