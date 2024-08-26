package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
       int n =rem(12356);
        System.out.println(n);
    }
    static int rem(int n){
        if(n==0){
            return 0;
        }

        return n % 10 + rem((n/10));

    }
}
