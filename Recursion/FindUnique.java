package Recursion;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique = 0;
        for (int i : arr) {
            unique^= i;

        }
        return unique;

    }
}
