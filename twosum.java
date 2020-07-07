package leetcode;

import java.util.Scanner;

public class twosum {
	 
	public void Sum(int[] num, int target) {
	        for(int i=0;i<num.length;i++){
	            for(int j=i+1;j<num.length;j++){
	                if(num[i]+num[j]==target){
	                	System.out.println("\nOutput: "+i+","+j);
	                }
	            }
	        }
	    }
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = in.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter target");
		int tar = in.nextInt();
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		twosum clas = new twosum();
		clas.Sum(arr, tar);
		
	}
}
