package Recursion;

import java.util.ArrayList;
import java.util.List;

public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 4, 7, 1, 0};
        int target = 4;
        System.out.println(SearchAllIndexes(arr, target, 0, new ArrayList<>()));

    }

    static List<Integer> SearchAllIndexes(int[] arr, int target, int index, List<Integer> indexes) {


        //static int search(int[]  arr , int target,int index ){

        //base case :if we reach to end of array means the target is not found.
        if (index == arr.length | index == -1) {
            return indexes;

        }
        if (arr[index] == target) {
            indexes.add(index);
        }

        return SearchAllIndexes(arr, target, index + 1, indexes);


    }
}
