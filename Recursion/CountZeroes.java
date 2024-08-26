package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        // String str = "30204";
        count(30204);
        System.out.println(count(30204));
    }

    static int count(int n) {
        if (n == 0) {
            return 1;

        } else if (n < 10) {
            return 0;

        }
        int lastdigit = n % 10;
        int start = 0;
        if (lastdigit == 0) {
            return 1 + count(n / 10);
        } else {
            return count(n / 10);
        }

    }
}