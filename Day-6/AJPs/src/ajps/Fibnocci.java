package ajps;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		int f=0,s=1,result;
		int num;
		int count=0;
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		System.out.println("Fibonacci series:"+f);
		System.out.println("Fibonacci series:"+s);
		while(true) {
			result=f+s;
			count++;
	     f=s;
	     s=result;
	     System.out.println("Fibonacci series:"+result);
	     if(result>=num) {
	    	 break;
	     }
		}
	}
}
