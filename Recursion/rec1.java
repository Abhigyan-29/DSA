package Recursion;

public class rec1 {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("hello");
        message1();
    }

    static void message1() {
        System.out.println("hello");
        message2();
    }

    static void message2() {
        System.out.println("hello");
        message3();
    }

    static void message3() {
        System.out.println("hello");
        message4();
    }


    static void message4() {
        System.out.println("hello");
    }
}
