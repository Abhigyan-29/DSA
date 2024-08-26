package Recursion;
//one function calls the other

public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
        print1(1);
    }

    static void print1(int n) {
        if ( n == 5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        //if you are calling  a function again and again, treat it like a separate function call in the stack.
        print1(n+1);
    }
}
