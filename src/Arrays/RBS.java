package Arrays;

import java.sql.SQLOutput;

public class RBS {
    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        int target = 4;
        System.out.println(bs(arr,target,0,arr.length-1));

    }
    static int bs(int arr[], int target , int s, int e){
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s]&&target<=arr[mid]){
                return bs(arr,target,s,mid-1);
            } else{
                return bs(arr, target,mid+1,e);
            }
        }
        if(target>=arr[mid]&& target<=arr[e]){
            return bs(arr,target, mid+1,e);
        }
        return bs(arr, target,s,mid-1);
    }
}
