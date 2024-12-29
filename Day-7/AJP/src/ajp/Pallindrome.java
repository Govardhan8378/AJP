//ISpallindrome using while loop
package ajp;
public class Pallindrome{
	static void ISPallindrome(int number) {
	int reminder,reverse = 0,temp;
	temp=number;
	while(number!=0) {
		reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
	}
	if(reverse==temp) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not a Pallindrome");
	}
	}
	public static void main(String[] args) {
		ISPallindrome(-8778);
	}
}