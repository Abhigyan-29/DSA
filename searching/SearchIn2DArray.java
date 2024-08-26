package searching;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 4;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    //[] this is used in the below line because the answer is in the form of array. eg- [2,3]
    static int[] search(int [][] arr , int target){
        for (int row = 0; row <arr.length; row++) {
            for(int column=0; column< arr[row].length;column++)
             if(arr[row][column] == target)
                 //idk why new keyword is used in the below line
                return new int[]{row,column};
        }
//if the target is not found. it'll return -1 -1
        return new int[]{-1,-1};
    }


}