//Tables printing using while loop
package ajp;
public class Table {
	 void Printwhile(int number) {
		int i=1;
		System.out.println("While Table:");
		while(i<=10) {
		System.out.println(number +"x" + i +"="+ number*i);
		i++;
	}
	}
		void Printfor(int number) {
			int i ;
			System.out.println("\nFor Table:");
			for (i = 1; i <=10; i++) {
				System.out.println(number +"x" + i +"="+ number*i);
			}
		}
	
	public static void main(String[] args) {
		Table t=new Table();
		t.Printwhile(5);
		
		t.Printfor(5);
	}

}
