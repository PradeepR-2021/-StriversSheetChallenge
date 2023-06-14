// https://www.codingninjas.com/codestudio/problems/majority-element-ii_8230738?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(hm.containsKey(arr.get(i))){
                hm.put(arr.get(i),hm.get(arr.get(i))+1);
            }else{
                hm.put(arr.get(i),1);
            }
        }
        int x = n/3;
        for(int i:hm.keySet()){
            if(hm.get(i)>x){
                ans.add(i);
            }
        }
        return ans;
    }
}

