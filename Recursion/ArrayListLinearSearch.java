package Recursion;

import java.util.ArrayList;

public class ArrayListLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 5, 2, 4, 9, 10};
        System.out.println(findAllIndex2(arr, 4, 0));
    }

//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        return findAllIndex(arr, target, index + 1, list);
//    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(AnsFromBelowCalls);
        return list;
    }
}
