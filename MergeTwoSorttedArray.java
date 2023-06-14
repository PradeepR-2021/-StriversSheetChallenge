//https://www.codingninjas.com/codestudio/problems/merge-two-sorted-arrays_8230835?challengeSlug=striver-sde-challenge&leftPanelTab=1
import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] ans = new int[m+n];
        int i =m-1;
        int j =n-1;
        int k = arr1.length-1;
       while(j>=0){
           if(i>=0 && arr1[i]>arr2[j]){
               arr1[k]=arr1[i];
               i--;
               k--;

           }else{
               arr1[k]=arr2[j];
               k--;
               j--;
           }
       }
        return arr1;
    }
}
