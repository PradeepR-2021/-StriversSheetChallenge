// https://www.codingninjas.com/codestudio/problems/next-greater-element_8230718?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=n-1;i>=0;i--){
			while(!st.isEmpty() && arr[i]>=st.peek()){
				st.pop();
			}
			if(st.isEmpty()==false){
        ans[i]=st.peek();
			}else{
				ans[i]=-1;
			}
			st.push(arr[i]);
		}
		return ans;
		
	}

}
