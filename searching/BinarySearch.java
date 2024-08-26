package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
 int[] arr ={34,45,56,67,78,89};
 int target =374;
 int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if target element is not found
     static int binarysearch(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            //find the middle element
            int mid = (start+end)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target >arr[mid]){
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
