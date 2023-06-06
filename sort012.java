//https://www.codingninjas.com/codestudio/problems/sort-0-1-2_8230695?challengeSlug=striver-sde-challenge&leftPanelTab=0
int s =0;int mid = 0;int e= arr.length-1;
        while(mid<=e){
            if(arr[mid]==0){
                swap(arr,mid,s);
                s++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,e);
                e--;
            }
        }