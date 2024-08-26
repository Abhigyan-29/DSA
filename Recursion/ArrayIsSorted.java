package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 };
        boolean ans = sorted(arr, 0);
        System.out.println(ans);
    }

    static boolean sorted(int[] arr, int index) {
        //base case
        //if we reach end of the array it means the array is sorted.
        if (index == arr.length - 1) {
            return true;
            //we can also write:
            //return arr[index] < arr[index+1] && sorted(arr,index+1)


            //check the current element and the next element
        } else if (arr[index] > arr[index + 1]) {
            return false;

        }
        //check rest of the array
        else {
            return sorted(arr, index +1);
        }
    }
}
