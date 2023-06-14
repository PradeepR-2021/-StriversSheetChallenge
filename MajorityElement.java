// https://www.codingninjas.com/codestudio/problems/day-6-majority-element_8230731?challengeSlug=striver-sde-challenge&leftPanelTab=1
import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],hm.get(arr[i])+1);
			}else{
                hm.put(arr[i],1);
			}
		}
		for(int i=0;i<arr.length;i++){
			int value = hm.get(arr[i]);
			if(value>(n/2)){
				return arr[i];
			}
		}
		return -1;
	}
}
