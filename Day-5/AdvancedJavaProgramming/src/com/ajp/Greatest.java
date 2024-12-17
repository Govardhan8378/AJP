package com.ajp;

public class Greatest {
	void Find(int a,int b) {
		if(a>b) {
			System.out.println(a+" is greather than "+b);
		}
		System.out.println(a+" is Less than "+b);
	}
	void Find(int a,int b,int c) {
		if(a>=b && a>=c) {
			//30>=10 30>=8
			//T  T=T
			System.out.println(a);
		}
		else if (b>=a && b>=c) {
			//10>=30  20>=8
			//F    F=F
				System.out.println(b);
		}
		else {
			System.out.println(c);
		}	
	}
public static void main(String[] args) {
	Greatest gt=new Greatest();
	gt.Find(12,15);
	gt.Find(30, 10,8);
	
}
}
