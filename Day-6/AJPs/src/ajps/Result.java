package ajps;

import java.util.Scanner;

public class Result {
	int sub1,sub2,sub3,sub4;
	void findresult() {
		if(sub1>=35 && sub1>=35 && sub1>=35 && sub1>=35) {
			int total=sub1+sub2+sub3+sub4,g;
			int avg=total/4;
			
			if(avg>=80 && avg>=100) {
				g='A';
				switch (g) {
				case 'A': {
					System.out.println("A");	
				}
				}
			}
			if(avg>=60 && avg>=80) {
				g='B';
				switch (g) {
				case 'B': {
					System.out.println("B");
				}
				}
			}
			if(avg>=40 && avg>=60) {
				g='C';
				switch (g) {
				case 'C': {
					System.out.println("C");
				}
				}
			}
			if(avg>=35 && avg>=40) {
				g='D';
				switch (g) {
				case 'D': {
					System.out.println("D");
				}
				}
			}
			if(avg<=36) {
				g='F';
				switch (g) {
				case 'F': {
						System.out.println("Fail");
				}
				}
			}
			System.out.println("Total= "+total);
			System.out.println("AVerage= "+avg);
			
		
			//or
			
//			if(avg>=80 && avg>=100) {
//				g='A';
//			}
//			else if(avg>=60 && avg>=80) {
//				g='B';
//			}
//			else if(avg>=40 && avg>=60) {
//				g='C';
//			}
//			else if(avg>=35 && avg>=40) {
//				g='D';
//			}
//			else {
//				g='F';
//			}
//			switch (g) {
//			case 'A': {
//				System.out.println("A");
//			}
//			case 'B': {
//			System.out.println("B");
//		    }
//			case 'C': {
//			System.out.println("C");
//		    }
//			case 'D': {
//			System.out.println("D");
//		    }
//			case 'F': {
//			System.out.println("Failed");
//		    }
//		  }
		}
		else {
			System.out.println("Student is failed in some subjects so we will not calculate the Results");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter 4 subjects marks");
		Scanner sc=new Scanner(System.in);
		Result r=new Result();
		r.sub1=sc.nextInt();
		r.sub2=sc.nextInt();
		r.sub3=sc.nextInt();
		r.sub4=sc.nextInt();
		r.findresult();
		
		
	}

}
