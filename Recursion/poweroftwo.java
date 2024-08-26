package Recursion;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 0;
        int cnt = 0;

        boolean ans =  (n & (n - 1)) == 0 ;


        System.out.println(ans);
    }
}
