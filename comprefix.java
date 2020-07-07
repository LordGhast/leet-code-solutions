package leetcode;

import java.util.*;

public class comprefix {
	public String longestCommonPrefix(String[] str) {
        String prefix="";
        if(str.length==0){
             return prefix;
        }
        else{
            Arrays.sort(str);
            StringBuilder s = new StringBuilder();
            for(int i=0;i<str[0].length();i++){
                if(str[0].charAt(i)==str[str.length - 1].charAt(i)){
                    s.append(str[0].charAt(i));
                }
                else{
                    break;
                }
            }
            prefix = s.toString();
        }System.out.println(prefix);
        return prefix;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		
		System.out.print("Enter array: ");
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextLine();
		}
		in.close();
		comprefix cp = new comprefix();
		cp.longestCommonPrefix(arr);
	}
	
}
