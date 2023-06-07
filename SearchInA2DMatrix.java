//https://www.codingninjas.com/codestudio/problems/search-in-a-2d-matrix_8230773?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        //here we using the binary search Approach so TC (logN) SP O(1)
        int col=mat.get(0).size()-1;
        int row =0;
        while(col>=0 && row<mat.size()){
            if(mat.get(row).get(col)==target){
                return true;
            }else if(mat.get(row).get(col)<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
