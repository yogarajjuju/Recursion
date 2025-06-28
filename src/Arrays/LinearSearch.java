package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,23,11,17,15,44};
        int target = 44;
        System.out.println(findIndex(arr,target,0));
    }
    static boolean find(int arr[], int target, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    static int findIndex(int [] arr, int target , int index){
        if(arr[index]== arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
}
