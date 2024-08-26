package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] num = {1, 4, 7, 3, 9};
        insertion(num);
        System.out.println(Arrays.toString(num));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;

                }


            }


        }
    }
}

