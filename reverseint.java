package leetcode;
import java.util.Scanner;
public class reverseint {
	public static int reverse(int a) {
		int r=0;
		while(a!=0) {
			int end =a%10;
			a=a/10;
			if (r > Integer.MAX_VALUE/10 || (r == Integer.MAX_VALUE / 10 && end > 7)) 
				return 0;
            if (r < Integer.MIN_VALUE/10 || (r == Integer.MIN_VALUE / 10 && end < -8)) 
            	return 0;
			r=r*10 + end;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the integer: ");
		int a = in.nextInt();
		in.close();
		
		reverseint.reverse(a);
		System.out.print("reversed int: ");
		System.out.print(reverse(a));
	}
}
		