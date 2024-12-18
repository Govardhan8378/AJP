//Sum of the value using While

package ajps;

public class WhileDemo {
	 static int sum(int limit)
	{
		int sum=0;
		int num=1;
	while(num<=limit) {
		sum+=num;
		num++;
	}
	return sum;
	}
public static void main(String[] args) {
	System.out.println(sum(5));    //1+2+3+4+5
}
}
