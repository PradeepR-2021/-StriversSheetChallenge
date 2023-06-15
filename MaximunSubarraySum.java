// https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_8230694?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = Integer.MIN_VALUE;
		long ans =0;
		for(int i=0;i<n;i++){
			ans+=arr[i];
			if(ans<0){
				ans =0;
				sum=Math.max(ans,sum);
			}
			sum=Math.max(ans,sum);

		}
		return sum;
	}

}
