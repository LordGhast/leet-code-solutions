package leetcode;
import java.util.Scanner;
public class intpalindrome {
	public boolean isPalindrome(int x) {
        int rx=0;
        boolean flag;
        int p = x;
        while(p!=0){
            int pop = p%10;
            p=p/10;
            rx = rx*10+pop;        
        }
        if(x==rx){
            flag = true;
        }
        else{
            flag = false;
        }
        System.out.print(flag);
        return flag;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the int: ");
		int x = in.nextInt();
		in.close();
		intpalindrome p = new intpalindrome();
		p.isPalindrome(x);
		//System.out.print(isPalindrome(x));
	}
}
