package leetcode;

import java.util.Scanner;

public class strtoint {
	public static int parse(String str) {
		str=str.trim();
		int result = 0;
		int i=0;
		
		boolean ifneg;
		if(str.charAt(0)=='-') {
			ifneg = true;
			i++;
		}
		else {
			ifneg = false;
		}
		
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
		if(ifneg==true) {
			result = -result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = in.nextLine();
		in.close();
		
		strtoint.parse(str);
		System.out.print(parse(str));
	}
}
