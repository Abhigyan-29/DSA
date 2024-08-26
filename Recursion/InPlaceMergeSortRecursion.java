package Recursion;

import java.util.Arrays;

public class InPlaceMergeSortRecursion {
    public static void main(String[] args) {
        int [] arr = { 3,2,1,56,34};
        mergesortinplace(arr,0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesortinplace(int[] arr, int s, int e) {
        // if the array has only one element then return
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergesortinplace(arr, s, mid);
        mergesortinplace(arr, mid, e);

        mergeinplace(arr, s, mid, e);
    }

    private static void mergeinplace(int[] arr, int s, int m, int e) {
        //new int[e - s] in Java creates a new array of integers with a size equal to e - s.
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays may not be complete
        //copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];

        }

    }
}
