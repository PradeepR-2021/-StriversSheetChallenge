// https://www.codingninjas.com/codestudio/problems/unique-paths_8230802?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int[][] dp = new int[m+1][n+1];
		for (int[] row : dp)
        Arrays.fill(row, -1);
		return findPaths(dp,m-1,n-1);

	}
	static int findPaths(int[][] dp,int i,int j){
		if(i==0 && j==0){
			return 1;
		}
		if(i<0 || j<0){
			return 0;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		int up = findPaths(dp,i-1,j);
		int left = findPaths(dp,i,j-1);
		dp[i][j]=up+left;
		return dp[i][j];
	}
}