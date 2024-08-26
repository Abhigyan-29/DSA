package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 78};
        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    //search in the array : return the index if item found
    //otherwise return -1.
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // running a loop
        for (int index = 0; index < arr.length; index++) {
            // check for index at every element
            //int element = arr[index];
            if (arr[index] == target) {
                return index;
            }
        }
        //if target not found
        return -1;

    }
}
