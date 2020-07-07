package leetcode;

import java.util.Scanner;

public class insertsearch {
	public static int search(int[] nums, int target) {
		int i=0;
		int n=nums.length;
		int x=0;
		
		for(i=0;i<n;i++) {
			if(nums[i]==target) {
				x=i;
			}
			else if(i==0 && target<nums[i]) {
				x=0;
			}
			else if(target<nums[i] && target>nums[i-1]) {
				x=i;
			}
			else if(target>nums[i]) {
				x=n;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("insert array: ");
		int[] nums = new int[4];
		for(int i=0;i<nums.length;i++) {
			nums[i]=in.nextInt();
		}
		System.out.print("insert target: ");
		int target = in.nextInt();
		in.close();
		
		insertsearch.search(nums,target);
		System.out.println(search(nums,target));
	}
			
}
