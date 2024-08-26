package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 7;
//        int start = 0;
//        int end = arr.length - 1;

        int ans = search(arr, 0, arr.length-1, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (target > arr[mid]) {
           return search(arr, mid + 1, end, target);
        }
        if (target < arr[mid]) {
          return  search(arr, start, mid - 1, target);
        } else return mid;

    }
}
