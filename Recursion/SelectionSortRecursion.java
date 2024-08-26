package Recursion;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
         selection(arr, arr.length, 0, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            // Find the maximum element in the current subarray
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            // Swap the maximum element found with the last element of the current subarray
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            // Recur for the remaining array
            selection(arr, r - 1, 0, 0);
        }
    }
}
