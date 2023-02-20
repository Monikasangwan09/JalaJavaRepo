package org.jala.java;

public class day8a {
	
	day9a dd = new day9a();

	public static void main(String[] args) {
		System.out.println("monika");
		System.out.println("main method invoke");
		day8a p=new day8a();
		
		p.m2();
		p.m3();
		p.monika();
	}
	
private void monika() {
int a=12;
		int j=30;
		System.out.println("private method invoke");
		
}
void m2() {
	System.out.println("kaju");

}
 protected void m3() {
	 int c=21;
	 System.out.println("proctected method invoke");
 }
}