package Sorting;

import java.util.Arrays;

public class MissingNumbers {


    void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int missingnumbers(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else i++;
        }
        //search for missing numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }


        }
        return arr.length;
    }
}
