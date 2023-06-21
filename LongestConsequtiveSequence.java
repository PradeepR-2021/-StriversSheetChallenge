//https://www.codingninjas.com/codestudio/problems/longest-consecutive-sequence_8230708?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> hs = new HashSet<>();
        for(int x: arr){
            hs.add(x);
        }
        int maxSeq = 0;
        for(int ele: arr){
            if(!hs.contains(ele-1)){
                int currSeq = 1;
                int currEle = ele;
                while(hs.contains(currEle+1)){
                    currEle+=1;
                    currSeq+=1;
                }
                maxSeq=Math.max(maxSeq,currSeq);

            }
        }
        return maxSeq;
    }
}