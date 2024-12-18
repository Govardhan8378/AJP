package ajps;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number between A-E:");
		String num=sc.next();
		switch(num) {
		case "A":System.out.println("choosen value A");break;
		case "B":System.out.println("choosen value B");break;
		case "C":System.out.println("choosen value C");break;
		case "D":System.out.println("choosen value D");break;
		case "E":System.out.println("choosen value E");break;
		case "F":System.out.println("choosen value F");break;
		default:System.out.println("Choose the number between A-E");	
		}

	}

}
