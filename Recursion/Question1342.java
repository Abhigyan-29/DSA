package Recursion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Question1342 {
    public static void main(String[] args) {
        int number = 1232;
        int ans = numberOfSteps(1232);
        System.out.println(ans);
    }

    static int numberOfSteps(int num) {
        return div(num, 0);
    }

    static int div(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if (n % 2 == 0) {
            return div(n / 2, steps + 1);
        } else {
            return div(n - 1, steps + 1);
        }
    }
}
