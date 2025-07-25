package Sorting;
import java.util.*;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[] ={4,3,2,1};
        select(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int arr[] , int r, int c, int max){
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[max]){
                select(arr, r,c+1,c);
            } else{
                select(arr, r, c+1,max);
            }
        } else{
            int temp=arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            select(arr, r-1,0,0);
        }
    }
}
