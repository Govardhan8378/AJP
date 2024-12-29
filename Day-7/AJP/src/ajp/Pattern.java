package ajp;

public class Pattern {
public static void main(String[] args) {
	for (int i = 1; i<=5; i++) {
		
		for (int j = i; j <=i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	int n=1;
	while(n<=5) {
		n++;
		int j = n;
		while(j<=n) {
			System.out.print("\n ");
			j++;
			int j1=1;
			while(j1<=n) {
				System.out.print(j1+" ");
				j1++;	
			}
		}
	}
	System.out.println();
}
}
