package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //  int [][] arr = new int[3][];
        int[][] arr2d = {
                {1, 2, 3},//0th index
                {4, 5},//1st index
                {6, 7, 8, 9, 0}//2nd index -> arr2d[2] = {6,7,8,9,0}
        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column i want to take input
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int[] ints : arr) {
            //for each column i want to take input
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col]);

            }
            System.out.println();
        }
    }
}
