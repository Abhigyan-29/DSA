package Recursion;

public class SumOf_N_Numbers {
    public static void main(String[] args) {
        int ans = sum(6);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n == 0 | n ==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
