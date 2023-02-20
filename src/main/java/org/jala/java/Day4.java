package org.jala.java;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.print.attribute.standard.Copies;

public class Day4 {

	public static void main(String[] args) {
		// Write a function to add integer values of an array
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 50;
		a[3] = 330;
		a[4] = 20;

		int t = 0;

		for (int i = 0; i < a.length; i++) {
		if(a[i]==20) {
			System.out.println("Stop the loop here");
			break;
		}
			t = t + a[i];
		}
		System.out.println(t / a.length);
		
		System.out.println("========================");
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==60) {
				System.out.println(i);}
				else
				{ System.out.println("their is no such value");}			
			}
		
		System.out.println("========================");
		
		for (int i = 1; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		System.out.println(a[1]);
		// copy array element
		
		int orignal[]= {8,7,6,5};
		int copy []= orignal ;
		for(int i=0;i<orignal.length;i++);
		// largest array
		int ary[]= {11,21,32,29,24,25,22};
		Arrays.sort(ary);
		System.out.println(ary[ary.length-2]);
		
		
		//even odd no
		int q[]= {1,2,4,5,7,9};
		for(int i=0;i<q.length;i++);
		if(q[1]%2==0) {
		System.out.println("odd no");}
		else
		{
			System.out.println("even no");
		}
				
		//.  verify if the array contains two specified elements(12,23)
		int w[]= {2,3,4,12,23};
		int find=12;
		
		for (int i=0;i<w.length;i++) {
		if (w [i]==12) {
	System.out.println("found");
	break;
	} 
		}
			

	}}
		
		
		

	

