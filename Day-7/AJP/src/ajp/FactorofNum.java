//Factorial using while loop
package ajp;
public class FactorofNum {
	static int factorial(int num) {
		int f=1;
		int i = 1;
		while(i<=num) {
			f=f*i;
			i++;
			System.out.println(f);
		}
		System.out.println("\n"+f);
		return i;
	}
public static void main(String[] args) {
	factorial(10);
}
}
