package com.ajp;

import java.util.Scanner;

public class Condition {
	void check(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}
public static void main(String[] args) {
//	int a=10;
//	int b=40;
//	System.out.println("a="+a+" b="+b);
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("a="+a+" b="+b);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=sc.nextInt();
	Condition c=new Condition();
	
	c.check(num);
	

}
}
