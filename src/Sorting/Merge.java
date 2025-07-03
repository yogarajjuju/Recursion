package Sorting;
import java.util.*;


public class Merge {
    public static void main(String[] args) {
        int arr[]= {3,8,4,12,6,5};
        arr =mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static int [] mergesort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    static int [] merge(int[] first, int [] second){
        int mix[] = new int[first.length+ second.length];
        int i =0, j=0,k=0;
        while(i< first.length&& j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            } else{
                mix[k]= second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        // it may be possible that the one of the array not get complete so we need to add those element in the new array.
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return  mix;
    }
}

