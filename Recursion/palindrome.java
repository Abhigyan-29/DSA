package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String str = "12321";
        if(palin(str)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }

    static boolean palin(String n) {
        String str = "12321";

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
}

