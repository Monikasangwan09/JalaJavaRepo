package org.jala.java;

import java.util.Scanner;

public class Day3part2 {

	public static void main(String[] args) {
		
//Armstrong number or not
		
		int a = 152;
		int t1=a;
		
		int length = 0;
		while(t1/10 == 0);{
			length=length+1;
		}
		
		{ System.out.println("Armstrong number" );}
		
		
		//prime no or not
		int q =11;
		if( q/2==0||q/3==0||q/5==0||q/7==0) {
			System.out.println( "not a prime no");
			} else {
			System.out.println( " a prime no");
		}
		
		
		//Write a program to palindrome or not.
		
		
		
		int num = 1221;
		int reversenum = 0;
		int reminder;
		
		
		    while (num != 0) {
		       int remainder = num % 10;
		      int num1= reversenum * 10 + remainder;
		      num /= 10;
		    }
		    if (num == reversenum) {
		        System.out.println( " is Palindrome.");
		      }
		      else {
		        System.out.println( " is not Palindrome.");
		        
		      }
		        //switch satement
		  
   

    int number = 6;
  
    switch (number % 2) {
    case 0:
      System.out.println(number+ " is an EVEN number");
      break;

    case 1:
      System.out.println(number + " is an ODD number");
      break;

    }
    //mail or female
    char gender='m';

    switch (gender) {
    case 'M':
    case 'm':
      System.out.printf("Male.");
      break;

    case 'F':
    case 'f':
      System.out.printf("Female.");
      break;

    default:
      System.out.printf("Unspecified Gender.");
    }
    System.out.printf("\n");
	}
    
//largest no

    
	
        int n1 = 10, n2=20, n3 = 30 ;{

      if( n1 >= n2 && n1 >= n3) {
        	
            System.out.println(n1 + " is the largest number.");
      }
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }

		
		
}
		
		
		
	


