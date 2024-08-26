package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,5,3,8,1,-23};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find max element in array and swap with correct index
            int last = arr.length - i - 1;
            int maxindex = getmaxindex(arr, 0, last);
            swap(arr,maxindex,last);

        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        return max;
    }
}
