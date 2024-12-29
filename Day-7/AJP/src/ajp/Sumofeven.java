package ajp;

import java.util.Scanner;

public class Sumofeven {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	   int input = 0;
	   System.out.println("Enter a number:");
	   input=sc.nextInt();
	   int sum=0;
	   int i=2;
	   do {
		   sum+=i;
		   i+=2;
	   }
	   while(i<=input);
	   System.out.println("sum of even number upto "+input+" is "+sum);
	   sc.close();
}
}
