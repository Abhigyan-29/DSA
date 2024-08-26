package Sorting;
import java.util.Arrays;
public class BubbleSort   {
    public static void main(String[] args) {
        int[] array = {1,3,2,98,9,4,5};
        int [] ans = Sort(array);
        System.out.println(Arrays.toString(ans));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int[] Sort( int [] arr){
        for (int i = 0; i < arr.length; i++) {
            //ofr each step, max item will come at last
            //j will go till length-i, because the elements before j are shorter than j
             for (int j =1; j <arr.length-i ; j++) {
                 //swap if previous element is bigger
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

            }

        }
        return arr;
    }
}
